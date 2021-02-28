package model.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.entidad.VideoJuego;

@Repository
public interface DaoVideoJuego extends JpaRepository<VideoJuego, Integer> {


}
