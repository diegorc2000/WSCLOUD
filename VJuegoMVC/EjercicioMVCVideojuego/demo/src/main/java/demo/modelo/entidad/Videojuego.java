package demo.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Videojuego {

    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String compania;
    private double precio;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return this.compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", compania='" + getCompania() + "'"
                + ", precio='" + getPrecio() + "'" + "}";
    }

}
