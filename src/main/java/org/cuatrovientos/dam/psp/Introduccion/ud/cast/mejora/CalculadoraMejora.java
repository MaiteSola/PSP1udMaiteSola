package org.cuatrovientos.dam.psp.Introduccion.ud.cast.mejora;

import java.util.Scanner;

public class CalculadoraMejora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String modo = args[0]; // Selecciona el modo
		float num1, num2;

		if (modo.equalsIgnoreCase("ENTEROS")) {
			float[] nums = leerDosNumeros(scan); // llamar método y obtener array
			num1 = nums[0];
			num2 = nums[1];

		} else {

			System.out.println("Calculadora Reales");
			float[] nums = leerDosNumeros(scan); // llamar método y obtener array
			num1 = nums[0];
			num2 = nums[1];
		} // Else nos da los números reales
		scan.close();
	}

	public static String validarOpcionesUsuario(String operador) {

		while (operador != "+" || operador != "-" || operador != "/" || operador != "x") {
			System.out.print("Dime operador (+, -, x, /): ");

		}
		return "";
		
	}
	
	public static float[] leerDosNumeros(Scanner scan) {
		Scanner scan2 = new Scanner(System.in);
		float[] numeros = new float[2]; // array para guardar los números
		System.out.println("Calculadora Enteros");

		System.out.println("Introduce el primer número:");
		numeros[0] = scan.nextFloat();

		System.out.println("Introduce el segundo número:");
		numeros[1] = scan.nextFloat();

		return numeros;
	}

}
