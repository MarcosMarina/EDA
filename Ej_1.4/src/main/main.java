package main;

import java.util.Scanner;
import tools.Simetrica;

/*
 * Crear un programa que solicite una matriz de orden 3x3.
 * Write a function that determines whether the matrix is symmetric
 */

	public class main {
		
		public static void main (String[] args) {

			int dimension = 3;
	
			int[][] matrix = new int[dimension][dimension];
	
			Scanner entrada = new Scanner(System.in);
	
			// Bucle para recorrer matriz
			for(int filas = 0; filas < dimension; filas++) { //Recorrer las filas
		
				for(int columnas = 0; columnas < dimension; columnas++) { //Recorrer columna
			
					// Meter los valores en cada posición
					System.out.println("Give me an int for position [" + filas + "][" + columnas +"]");
			
					matrix[filas][columnas] = entrada.nextInt();
				}
			}
			
			if(Simetrica.isSymetric (matrix) == true) {
				System.out.println("hola");
			}
			else {
				System.out.println("FFFFF");
			}
			
	}
	}