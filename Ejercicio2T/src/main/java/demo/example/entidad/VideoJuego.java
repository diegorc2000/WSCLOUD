package demo.example.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VideoJuego {

	@Id
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String nombre;
	private String compañia;
	private double precio;
	private double puntuacion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	@Override
	public String toString() {
		return "VideJuego id=" + id + ", nombre=" + nombre + ", compañia=" + compañia + ", precio=" + precio
				+ ", puntuacion=" + puntuacion;
	}
	
	
}
