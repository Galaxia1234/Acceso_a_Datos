package modelo.entidad;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="librerias")
public class Libreria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_libreria;
	private String nombre ;
	private String direccion;
	
	@Override
	public String toString() {
		return "Libreria [id_libreria=" + id_libreria + ", nombre=" + nombre + ", direccion=" + direccion + ", due�o="
				+ due�o + ", coleccionLibros=" + coleccionLibros + "]";
	}

	private String due�o;
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Libro> coleccionLibros;
	
	public Libreria () {
		super();
		coleccionLibros = new ArrayList<Libro>();
	}
	public Libreria(String nombre, String nombreDue�o, String direccion) {
		super();
		this.nombre = nombre;
		this.due�o = nombreDue�o;
		this.direccion = direccion;
		coleccionLibros = new ArrayList<Libro>();
	}
	public int getId() {
		return id_libreria;
	}
	public void setId(int id) {
		this.id_libreria = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDue�o() {
		return due�o;
	}
	public void setdue�o(String due�o) {
		this.due�o = due�o;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Libro> getColeccionLibros() {
		return coleccionLibros;
	}
	public void setColeccionLibros(List<Libro> libros1) {
		this.coleccionLibros = libros1;
	}
	
	public void a�adirLibro(Libro l) {
		coleccionLibros.add(l);
	}
	
	
	
	

}
