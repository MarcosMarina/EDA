package main;

import java.util.Scanner;

public class Main {
	
	/*
	 * 	Tenemos un texto de un número de líneas determinado, de longitud variable. 
	 *  Se deben almacenar dichas líneas y ser mostradas en función de su longitud.
	 */

	public static void main(String[] args) {
		
		int lineas=0;
		
		// Herramienta para leer las entradas de teclado
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime el numero de lineas: ");
		lineas= entrada.nextInt();
		entrada.nextLine(); //fflush en C, limpieza del buffer de entrada
				
		// Declaramos un array de cadenas
				String[] cadenas = new String[lineas];
		
		// Bucle normal de 0 a numero de lineas-1, rellenando el array de cadenas
		for(int i = 0; i < lineas; i++) {
			
			System.out.println("Dame la linea "+ i + ":");		
			cadenas[i] = entrada.nextLine();
			
		}
		
		// Bucle for each que imprime las cadenas
		// Para cada elemento de tipo X del array, hacer lo que haya dentro del bucle
		for(String s : cadenas) {
			
			// Herramienta para imprimir por consola
			System.out.println(s);
		}

	}

}
