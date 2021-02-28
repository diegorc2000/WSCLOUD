package demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.modelo.entidad.Videojuego;
import demo.modelo.persistencia.DaoVideojuego;

@Controller
public class ControladorUsuario {

    @Autowired
    private DaoVideojuego daoVideojuego;

    @GetMapping("/lista")
    public String obtenerLista(Model model) {
        List<Videojuego> lVideojuegos = daoVideojuego.findAll();
        model.addAttribute("lista", lVideojuegos);
        return "lista-videojuegos";
    }

    @GetMapping("/busqueda")
    public String buscarVideojuego(Model model) {
        Videojuego v = daoVideojuego.findById(2);
        model.addAttribute("resultBusqueda", v);
        return "busqueda-videojuego";
    }

    @PostMapping("/busqueda-id")
    public String busquedaVG(@RequestParam("id_videojuego") int idVideojuego, Model model) {
        Videojuego v = daoVideojuego.findById(idVideojuego);
        model.addAttribute("res_busqueda", v);

        if (v != null) {
            return "busqueda-id";
        } else {
            return "error";
        }
    }

}
