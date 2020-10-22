package Main;

import tools.*;

/*Diseñar el TAD con nombre Bolsa como una colección de elementos no
ordenados y que pueden estar repetidos. Las operaciones del tipo abstracto
son: crear bolsa, añadir un elemento, bolsa vacia (comprueba si la bolsa tiene
algún elemento), cuantos (determina el número de veces que se encuentra un
elemento), unión y total.
Realiza la especificación informal y formal considerando como constructores las
operaciones CrearBolsa y Añadir.
También, implementa la clase Bolsa y escribe un programa que utilice las
operaciones de Bolsa.*/

public class main {

	public static void main(String[] args) {
		
		Bolsa miBolsa= new Bolsa();
		miBolsa.crearBolsa ();

	}

}
