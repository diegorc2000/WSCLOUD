package demo.example.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.example.entidad.VideoJuego;

@Repository
public interface DaoVideoJuego extends JpaRepository<VideoJuego, Integer> {

}
