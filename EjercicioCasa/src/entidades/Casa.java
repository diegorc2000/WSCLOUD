package entidades;

import java.util.ArrayList;

public class Casa {

	private Persona propietario;
	private double precio;
	private Direccion direccion;
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Persona> listaInquilinos;

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaInquilinos;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaInquilinos = listaPersonas;
	}

	public double calcularM2() {
		double suma = 0;
		for (Habitacion h : listaHabitaciones) {
			suma += h.getM2();
		}
		return suma;
	}

	@Override
	public String toString() {
		return "PROPIETARIO: " + propietario + "\nDIRECCIÓN: " + direccion + "\nPRECIO: " + precio
				+ " € \nLISTA HABITACIONES: " + listaHabitaciones + "\nLISTA PERSONAS: " + listaInquilinos;
	}

}
