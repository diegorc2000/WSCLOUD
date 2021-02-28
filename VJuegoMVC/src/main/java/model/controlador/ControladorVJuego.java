package model.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.entidad.VideoJuego;
import model.negocio.GestorVJuego;
import model.persistencia.DaoVideoJuego;

@Controller
public class ControladorVJuego {

	@Autowired
	private GestorVJuego gestorVJuego;

	@GetMapping("listaVJ")
	public String obtenerLista(Model model) {
		List<VideoJuego> lVideojuegos = gestorVJuego.obtenerListaVideojuegos();
		if (lVideojuegos == null) {
			return "inicio";
		} else {
			model.addAttribute("lista", lVideojuegos);
			return "inicio";
		}
	}

	@GetMapping("VJ")
	public String busqueda(@RequestParam("busqueda_id") int id, Model model) {
		
		VideoJuego vj = gestorVJuego.buscarVideojuego(id);
		
		if (vj == null) {
			return "inicio";
		} else {
			model.addAttribute("vj", vj);
			return "inicio";
		}
	}

}
