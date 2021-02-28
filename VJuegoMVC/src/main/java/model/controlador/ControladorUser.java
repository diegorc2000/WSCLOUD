package model.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.entidad.Usuario;
import model.entidad.VideoJuego;
import model.negocio.GestorUsuario;
import model.negocio.GestorVJuego;
import model.persistencia.DaoVideoJuego;

@Controller
public class ControladorUser {

	@Autowired
	private GestorUsuario gestorUsuario;

	@Autowired
	private GestorVJuego gestorVJuego;

	@PostMapping("doLogin")
	public String logearse(@RequestParam("nombre_u") String nombre, @RequestParam("contraseña") String contrasenia,
			Model model) {

		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setContrasenia(contrasenia);

		boolean correcto = gestorUsuario.validarUsuario(usuario);

		if (correcto) {
			model.addAttribute("nombreUsuario", nombre);

			List<VideoJuego> listaV = gestorVJuego.obtenerListaVideojuegos();

			model.addAttribute("lista", listaV);

			return "inicio";
		} else {
			return "error_login";
		}

	}

}
