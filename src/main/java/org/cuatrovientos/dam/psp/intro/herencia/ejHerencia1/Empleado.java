package org.cuatrovientos.dam.psp.intro.herencia.ejHerencia1;

public class Empleado extends Trabajador {
	
	
	// Luego crea la clase Empleado que extiende a trabajador y tiene los atributos
		// privados sueldo,
		// impuestos, y el atributo private final PAGAS (que sean 14).
		// Crea constructor, getters y setters, toString y el métod calcularPaga donde
		// para calcularla sea (sueldo-impuestos)/PAGAS.

		private float sueldo;
		private float impuestos;
		public static final int PAGAS = 14;

		public Empleado(String nombre, String puesto, String direccion, String telefono, String nss, float sueldo,
				float impuestos) {
			super(nombre, puesto, direccion, telefono, nss);
			this.sueldo = sueldo;
			this.impuestos = impuestos;
			// TODO Auto-generated constructor stub
		}

		public float getSueldo() {
			return sueldo;
		}

		public void setSueldo(float sueldo) {
			this.sueldo = sueldo;
		}

		public float getImpuestos() {
			return impuestos;
		}

		public void setImpuestos(float impuestos) {
			this.impuestos = impuestos;
		}

		public static int getPagas() {
			return PAGAS;
		}

		@Override
		public String toString() {
			return "Consultor [" + super.toString() + "sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
		}

		public float calcularPaga(float sueldo, float impuestos) {

			float paga = (sueldo - impuestos) / PAGAS;

			return paga;

		}

	

}
