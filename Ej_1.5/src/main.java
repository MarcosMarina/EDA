import java.util.Scanner;

public class main {

		/*
		 *	Definir  una  funci�n  que  permita  introducir  un  texto  de  cinco  l�neas  por  consola,
		 * 	posteriormente mostrar el texto por consola.
		 */

			public static void main(String[] args) {


				// Declaramos un array de cadenas
				String[] cadenas = new String[5];
				
				// Herramienta para leer las entradas de teclado
				Scanner entrada = new Scanner(System.in);
				
				// Bucle normal de 0 a 4, rellenando el array de cadenas
				for(int i = 0; i < 5; i++) {
					
					System.out.println("Dame una cadena: ");		
					cadenas[i] = entrada.nextLine();
					
				}
				
				// Bucle for each que imprime las cadenas
				// Para cada elemento de tipo X del array, hacer lo que haya dentro del bucle
				for(String s : cadenas) {
					
					// Herramienta para imprimir por consola
					System.out.println(s);
				}
				
				
				entrada.close();
				

			}


	}

