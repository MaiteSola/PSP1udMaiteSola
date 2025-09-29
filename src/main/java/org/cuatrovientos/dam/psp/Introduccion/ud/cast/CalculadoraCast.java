package org.cuatrovientos.dam.psp.Introduccion.ud.cast;

import java.util.Scanner;

public class CalculadoraCast {

	public static void main(String[] args) {
		// TODO Validar parámetros(systemExit)

		Scanner scan = new Scanner(System.in);

		if (args.length == 0) {
			System.out.println("Debes indicar si quieres 'Enteros' o 'Reales'");
			return;
		}

		String modo = args[0];

		System.out.println("CALCULADORA (" + modo + ")");
		System.out.print("Introduce el primer número: ");
		float num1 = scan.nextFloat();
		System.out.print("Introduce el segundo número: ");
		float num2 = scan.nextFloat();
		scan.nextLine(); // limpiar buffer

		// UN método para validar que se introduce bien.
		System.out.print("Dime operador (+, -, x, /): ");
		String operador = scan.nextLine();

		float resultado = operar(num1, num2, operador);

		if (modo.equals("Enteros")) {
			// casteamos el resultado a entero
			System.out.println("El resultado es: " + (int) resultado);
		} else {
			// mostramos con decimales
			System.out.println("El resultado es: " + resultado);
		}
		
		scan.close();
	}

	public static float operar(float num1, float num2, String operador) {
		float resultado = 0;
		switch (operador) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "x":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operador no válido");
		}
		return resultado;

	}

	public static String validarOpcionUsuario(String operador) {

		while (operador != "+" || operador != "-" || operador != "/" || operador != "x") {
			System.out.print("Dime operador (+, -, x, /): ");

		}

		return "";
	}

}
