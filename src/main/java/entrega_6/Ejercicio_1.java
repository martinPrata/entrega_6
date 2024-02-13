package entrega_6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique la oracion a evaluar (No puede estar vacia): ");
		String oracion = scanner.nextLine();
		
		while (oracion.isEmpty()) {
			System.out.println("La oracion no puede estar vacia, ingrese nuevamente");
			oracion = scanner.nextLine();
		}
		String [] arrayOracion = oracion.split(" ");
		
		System.out.println("La cantidad de palabras que tiene la oracion es: " + arrayOracion.length);
		
		Arrays.sort(arrayOracion);
		
		System.out.println(repitePalabras(arrayOracion));
		
		
		System.out.println("Palabras ordenadas: \n" + Arrays.toString(arrayOracion));
				
		String [] arrayLetras = oracion.replaceAll(" ", "").split("");
		
		Arrays.sort(arrayLetras);
		
		System.out.println("Letras ordenadas: \n" + Arrays.toString(arrayLetras));
		
	}
	
	private static String repitePalabras(String[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i].equals(array[i-1])) {
				return "Se repite al menos una palabra";
			}
		}
		return "Ninguna palabra se repite";
	}
	

}
