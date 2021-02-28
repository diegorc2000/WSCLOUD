package model.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer> {

	public Usuario findByNombre(String nombre);

	public Usuario findByNombreAndPassword(String nombre, String password);
}
