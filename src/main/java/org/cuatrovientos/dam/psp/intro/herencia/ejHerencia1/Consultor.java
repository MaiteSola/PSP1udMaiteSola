package org.cuatrovientos.dam.psp.intro.herencia.ejHerencia1;

import java.time.Duration;

public class Consultor extends Trabajador {

	// Crea la clase Consultor que extienda a trabajador.
	// Con los atributos privados horas y tarifa.
	// Crea constructor (usando super), getters y setters, y el método calcularPaga,
	// donde es las horas * tarifa

	// Duration se utiliza para intervalos de tiempo.

	private Duration horas;
	private float tarifa;
	

	public Consultor(String nombre, String puesto, String direccion, String telefono, String nss, Duration horas,
			float tarifa) {
		super(nombre, puesto, direccion, telefono, nss);
		this.horas = horas;
		this.tarifa = tarifa;

	}

	public Duration getHoras() {
		return horas;
	}

	public void setHoras(Duration horas) {
		this.horas = horas;
	}

	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}

	public float calcularPaga(Duration horas, float tarifa) {
		float paga = horas.toHours() * tarifa;

		return paga;
	}

}
