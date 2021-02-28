package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import model.entidad.Usuario;
import model.entidad.VideoJuego;

import model.persistencia.DaoUsuario;import model.persistencia.DaoVideoJuego;

@SpringBootApplication
public class VJuegoMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(VJuegoMvcApplication.class, args);

		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
		
		Usuario u = new Usuario();
		u.setNombre("Diego");
		u.setContrasenia("Batman");
		
		DaoVideoJuego dv = context.getBean("daoVideojuego", DaoVideoJuego.class);
		
		du.save(u);
		
		List<VideoJuego> listaVJuego = new ArrayList<>();

		VideoJuego v1 = new VideoJuego();
		v1.setNombre("Fornite");
		v1.setCompañia("Epic Games");
		
		listaVJuego.add(v1);

		VideoJuego v2 = new VideoJuego();
		v2.setNombre("Minecraft");
		v2.setCompañia("Mojang");
		dv.save(v2);
		
		listaVJuego.add(v2);

		VideoJuego v3 = new VideoJuego();
		v3.setNombre("Raft");
		v3.setCompañia("	Axolot Games");
		dv.save(v3);
		
		listaVJuego.add(v3);

		VideoJuego v4 = new VideoJuego();
		v4.setNombre("Mario Bros");
		v4.setCompañia("Nintendo");
		dv.save(v4);
		
		listaVJuego.add(v4);

		System.out.println(dv.findAll());

	}

}
