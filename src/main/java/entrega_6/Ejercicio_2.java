package entrega_6;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero a : ");
		double numA = scanner.nextDouble();
		
		System.out.println("Ingrese un numero b : ");
		double numB = scanner.nextDouble();
		
		char operacion;
		
		do {
			System.out.println("Ingrese la operacion que desea realizar [+, -, *, /, %] : ");
			operacion = scanner.next().charAt(0);
		} while (operacion  != '+' && operacion != '-' && operacion != '*' && operacion != '/' && operacion != '%');
		
		realizarOperacion(numA, numB, operacion);
	}

	private static void realizarOperacion(double numA, double numB, char operacion) {
		double resultado = 0.0; 
		
		if (operacion == '+') {
			resultado = sumar(numA, numB);
			System.out.println(numA + " + " + numB + " = " + resultado);
		} else if (operacion == '-') {
			resultado = restar(numA, numB);
			System.out.println(numA + " - " + numB + " = " + resultado);
		} else if (operacion == '*') {
			resultado = multiplicar(numA, numB);
			System.out.println(numA + " * " + numB + " = " + resultado);
		} else if (operacion == '/') {
			if (numB != 0) {
				resultado = dividir(numA, numB);
				System.out.println(numA + " / " + numB + " = " + resultado);
			} else {
				System.out.println("Error, no se puede dividir por cero");
			}
		} else if (operacion == '%') {
			resultado = resto(numA, numB);
			System.out.println(numA + " % " + numB + " = " + resultado);
		} else {
			System.out.println("Operacion invalida");
		}
	}
	
	public static double sumar(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double restar(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	public static double resto(double num1, double num2) {
		return num1 % num2;
	}
}
