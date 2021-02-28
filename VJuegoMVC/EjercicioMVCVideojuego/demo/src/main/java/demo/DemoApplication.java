package demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Videojuego;
import demo.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		DaoVideojuego dv = context.getBean("daoVideojuego", DaoVideojuego.class);

		Videojuego v1 = new Videojuego();
		v1.setNombre("GTA V");
		v1.setCompania("Rockstar games");
		v1.setPrecio(34);
		dv.save(v1);

		Videojuego v2 = new Videojuego();
		v2.setNombre("Assassins Creed Valhalla");
		v2.setCompania("Ubisoft");
		v2.setPrecio(44);
		dv.save(v2);

		Videojuego v3 = new Videojuego();
		v3.setNombre("Hitman 3");
		v3.setCompania("IO Interactive");
		v3.setPrecio(24);
		dv.save(v3);

		Videojuego v4 = new Videojuego();
		v4.setNombre("FIFA 2021");
		v4.setCompania("Electronic Arts");
		v4.setPrecio(60);
		dv.save(v4);

		List<Videojuego> lista = dv.findAll();
		for (Videojuego v : lista) {
			System.out.println(v);
		}

	}

}
