package main;

/*
 * Introducir  los  datos  de  una  matriz  cuadrada  de  tamaño  prefijado  
 * y comprobar indicando valor y posición dónde existen elementos denominados puntos de silla:
 * dato que es a la vez el menor valor de su fila y el mayor de su columna.
 */

public class main {

	public static void main(String[] args) {
		//Ejercicio1.2: Calcular Puntos de Silla de una matriz de tamaño prefijado.
				
				//Matriz principal
				int [][] matriz = new int [3][3];
				
				//Variables para almacenar valores y posiciones de la matriz locales.
				int min=11, max=0, mini=0, minj=0, maxi=0, maxj=0;
				
				//Matrices para almacenar los menores de cada fila.
				int [] menor = new int [3];	
				int [] menorposi = new int [3];
				int [] menorposj = new int [3];
				
				//Matrices para almacenar los mayores de cada columna.
				int [] mayor = new int [3];
				int [] mayorposi = new int [3];
				int [] mayorposj = new int [3];
				
				//Variables auxiliares.
				int i,j;
				boolean a=false, b=false;

				//Rellenamos matriz con numeros aleatorios del 1 al 10.
				for (i=0; i<matriz.length; i++) {
					for (j=0; j<matriz.length; j++) {
						matriz[i][j] = (int) (Math.random()*9+1);
					}
				}
				
				//Mostramos matriz por pantalla.
				System.out.println();
				System.out.println("MATRIZ: ");
				
				for (i=0; i<matriz.length; i++) {
					for (j=0; j<matriz.length; j++) {
						System.out.print(matriz[i][j] + " ");
					}
					System.out.println();
				}
				
				//Calculamos los menores y sus posiciones y los almacenamos en matrices.
				System.out.println();
				System.out.println("MENORES DE CADA FILA: ");
				
				for (i=0; i<matriz.length; i++) {
					for (j=0; j<matriz[i].length; j++) {
						
						if (min==matriz[i][j]) {
							a=true;
						}
						else if (min>matriz[i][j]) {
							
							min = matriz[i][j];
							mini = i;
							minj = j;
							a=false;
						}
						menor [i] = min;
						menorposi [i] = mini;
						menorposj [i] = minj;
					}
					if (a==false) {
						System.out.println("El menor de la fila "+(i+1)+" es: "+menor[i]+" con posicion: "+(menorposi[i]+1)+", "+(menorposj[i]+1));
					}
					min=11;
					a=false;
				}
				
				//Calculamos los mayores y sus posiciones y los almacenamos en matrices.
				System.out.println();
				System.out.println("MAYORES DE CADA COLUMNA: ");
				
				for (j=0; j<matriz.length; j++) {
					for (i=0; i<matriz[j].length; i++) {
						
						if (max==matriz[i][j]) {
							b=true;
						}
						if (max<matriz[i][j]) {
									
							max = matriz[i][j];
							maxi = i;
							maxj = j;
							b=false;
						}
						mayor [j] = max;
						mayorposi [j] = maxi;
						mayorposj [j] = maxj;
					}	
					if (b==false) {
						System.out.println("El mayor de la columna "+(j+1)+" es: "+mayor[j]+" con posicion: "+(mayorposi[j]+1)+", "+(mayorposj[j]+1));
					}
					max = 0;
					b=false;
				}
				
				//Comparamos los mayores y los menores para comprobar si son puntos de silla.
				System.out.println();
				System.out.println("PUNTOS DE SILLA: ");
				
				for (i=0; i<menor.length; i++) {
					if (menorposi[i]==mayorposi[i] && menorposj[i]==mayorposj[i]) {
						System.out.println("El numero "+menor[i]+" con posicion: "+(menorposi[i]+1)+", "+(menorposj[i]+1));
					}
				}
			}

	}
