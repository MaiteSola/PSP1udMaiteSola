package org.cuatrovientos.dam.psp.intro.herencia.ejHerencia2;

public abstract class Corredor {

	// Creamos la clase abstracta Corredor con el atributo privado nombre, y el
	// método abstracto correr().
	// (constructor, getters y setters, toString)
	// Crea las clases extendidas deportista que correrá a 7 km/h y
	// la clase extendida informático que correrá a 3 km/h.

	protected String nombre; //En abstracta ponemos protected

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Corredor(String nombre) {
		super();
		this.nombre = nombre;
	} //Te deja hacerlo pero no implementarlo.

	@Override
	public String toString() {
		return "Corredor\n===================\nNombre: " + nombre;
	}

	public abstract float correr();


}
