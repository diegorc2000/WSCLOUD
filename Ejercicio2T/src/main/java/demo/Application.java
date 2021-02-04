package demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.example.entidad.VideoJuego;
import demo.example.persistencia.DaoVideoJuego;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoVideoJuego daoVideoJuego = context.getBean("daoVideoJuego", DaoVideoJuego.class);
		
		//CREO 3 videoJuegos;
		
		//1
		VideoJuego v1 = new VideoJuego();
		v1.setNombre("Minecraft");
		v1.setPrecio(19.99);
		v1.setCompañia("MOJANG");
		v1.setPuntuacion(9);
		
		//daoVideoJuego.save(v1);
		
		//2
		VideoJuego v2 = new VideoJuego();
		v2.setNombre("GTA V");
		v2.setPrecio(80);
		v2.setCompañia("ROCKSTAR GAMES");
		v2.setPuntuacion(10);
		
		//daoVideoJuego.save(v2);
		
		//3
		VideoJuego v3 = new VideoJuego();
		v3.setNombre("Raft");
		v3.setPrecio(20);
		v3.setCompañia("Steam");
		v3.setPuntuacion(9);
		
		//daoVideoJuego.save(v3);
		
		//Modifico dos juegos
		
		//1
		VideoJuego v4 = new VideoJuego();
		v4.setId(3);
		v4.setNombre("RAFT");
		v4.setPrecio(19.99);
		v4.setCompañia("Redbeet Interactive");
		v4.setPuntuacion(9);
		
		//daoVideoJuego.save(v4);
		
		//2
		VideoJuego v5 = new VideoJuego();
		v5.setId(2);
		v5.setNombre("GTA V");
		v5.setPrecio(60);
		v5.setCompañia("ROCKSTAR GAMES");
		v5.setPuntuacion(10);
		
		//daoVideoJuego.save(v5);
		
		//Accedo a un video juego
		
		//1
		VideoJuego v6 = daoVideoJuego.findById(1).get();
		System.out.println(v6);
		
		//Compruebo si existe un objeto
		
		//Existe
		Optional<VideoJuego> juego1Optional = daoVideoJuego.findById(2);
		if (juego1Optional.isPresent()) {
			System.out.println("Existe el Juego");
			System.out.println(juego1Optional.get());
		}else {
			System.out.println("El Juego no existe");
		}
		
		//No Existe
		Optional<VideoJuego> juego2Optional = daoVideoJuego.findById(4);
		if (juego2Optional.isPresent()) {
			System.out.println("Existe el Juego");
			System.out.println(juego2Optional.get());
		}else {
			System.out.println("El Juego no existe");
		}
	
		//Recupero todos los juegos
		List<VideoJuego> listaJuegos = daoVideoJuego.findAll();
		System.out.println(listaJuegos);
		
		//Creo otro juego
		VideoJuego v7 = new VideoJuego();
		v7.setNombre("Fortnite");
		v7.setPrecio(0);
		v7.setCompañia("Epic Game");
		v7.setPuntuacion(5);
		
		//daoVideoJuego.save(v7);
		
		//Borro el juego v7
		daoVideoJuego.deleteById(5);
		listaJuegos = daoVideoJuego.findAll();
		System.out.println(listaJuegos);

	}

}
