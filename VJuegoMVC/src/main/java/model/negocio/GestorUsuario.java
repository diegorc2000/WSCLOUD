package model.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entidad.Usuario;
import model.persistencia.DaoUsuario;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsuario daoUsuario;

	public boolean validarUsuario(Usuario usuario) {
		Usuario usuarioAux = daoUsuario.findByNombreAndPassword(usuario.getNombre(), usuario.getContrasenia());

		if (usuarioAux == null) {
			return false;
		} else {
			return true;
		}
	}

}
