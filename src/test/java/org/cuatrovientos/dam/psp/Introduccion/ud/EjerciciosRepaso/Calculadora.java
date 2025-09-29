package org.cuatrovientos.dam.psp.Introduccion.ud.EjerciciosRepaso;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (args.length == 0) {
			System.out.println("Debes indicar si quieres 'Enteros' o 'Reales'");
			return;
		}

		String modo = args[0]; // Aquí le paso el modo del run configuration

		if (modo.equals("Enteros")) {
			System.out.println("CALCULADORA DE ENTEROS");
			System.out.print("Introduce el primer número entero: ");
			int num1 = scan.nextInt();
			System.out.print("Introduce el segundo número entero: ");
			int num2 = scan.nextInt();
			scan.nextLine(); // limpiar buffer
			System.out.print("Dime operador (+, -, x, /): ");
			String operador = scan.nextLine();

			int resultado = (int) operar(num1, num2, operador);
			System.out.println("El resultado es: " + resultado);

		} else if (modo.equals("Reales")) {
			System.out.println("CALCULADORA DE REALES");
			System.out.print("Introduce el primer número real: ");
			float num1 = scan.nextFloat();
			System.out.print("Introduce el segundo número real: ");
			float num2 = scan.nextFloat();
			scan.nextLine(); // limpiar buffer
			System.out.print("Dime operador (+, -, x, /): ");
			String operador = scan.nextLine();

			float resultado = operar(num1, num2, operador);
			System.out.println("El resultado es: " + resultado);

		} else {
			System.out.println("Modo no válido. Usa 'Enteros' o 'Reales'.");
			
			scan.close();
		}
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

}
