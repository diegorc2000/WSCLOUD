package model.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entidad.VideoJuego;
import model.persistencia.DaoVideoJuego;

@Service
public class GestorVJuego {

	@Autowired
	private DaoVideoJuego daoVideojuego;

	public VideoJuego buscarVideojuego(int id) {
		Optional<VideoJuego> oVideojuego = daoVideojuego.findById(id);

		if (oVideojuego.isPresent()) {
			return oVideojuego.get();
		} else {
			return null;
		}
	}

	public List<VideoJuego> obtenerListaVideojuegos() {
		return daoVideojuego.findAll();
	}

}
