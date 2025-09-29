package org.cuatrovientos.dam.psp.intro.colecciones.ej1;

import java.time.Duration;
import java.util.Objects;


public class Receta {

	
	//Define una clase Receta con los siguientes atributos:

		//nombre (String)
		//tiempoPreparacion (int, en minutos)
		//tipo (Enum, ej: Entrante, Principal, Postre)
		//Incluye un constructor, métodos getters, setters y un toString() para mostrar la información.

	private String nombre;
	private Duration tiempoPreparacion;
	private Platos tiposPlatos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Duration getTiempoPreparacion() {
		return tiempoPreparacion;
	}
	public void setTiempoPreparacion(Duration tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	public Platos getTiposPlatos() {
		return tiposPlatos;
	}
	public void setTiposPlatos(Platos tiposPlatos) {
		this.tiposPlatos = tiposPlatos;
	}
	public Receta(String nombre, Duration tiempoPreparacion, Platos tiposPlatos) {
		super();
		this.nombre = nombre;
		this.tiempoPreparacion = tiempoPreparacion;
		this.tiposPlatos = tiposPlatos;
	}
	@Override
	public String toString() {
		return "Receta\n==================\nNombre de la receta: " + nombre + "\nTiempo de Preparacion: " + tiempoPreparacion + "\nTipo de Plato: " + tiposPlatos
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receta other = (Receta) obj;
		return Objects.equals(nombre.toLowerCase(), other.nombre.toLowerCase());
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
}
