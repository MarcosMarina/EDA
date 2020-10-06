package main;

import java.util.Scanner;

/*
 * 	Escribir una funci�n que tome una cadena del teclado  
 *  y devuelva el n�mero de vocales, consonantes y espacios en blanco de la cadena.
 */

public class Main {

	public static void main(String[] args) {
		String linea;
		int vocales=0;
		int consonantes=0;
		int espacios=0;
		
		System.out.println("Dame una cadena: ");
		Scanner entrada= new Scanner(System.in);
		linea= entrada.nextLine();
		linea = linea.toLowerCase(); //Pasamos todo a min�sculas ya que nos interesan tanto las vocales may�sculas como las min�sculas
		
		for(int i=0; i<linea.length();i++) { 
			
				 if ((linea.charAt(i)=='a') || (linea.charAt(i)=='e') || (linea.charAt(i)=='i') || (linea.charAt(i)=='o') || (linea.charAt(i)=='u')){ 
				    vocales++;
				  }
				 
				 else if(linea.charAt(i)==' ') {
					 espacios++;
				 }
				 
				 else if (Character.isLetter(linea.charAt(i))){ //Character.isLetter nos sirve para saber si es una letra
				   consonantes++;
				 }
		}
		
		System.out.println("El n�mero de vocales es:"+ vocales);
		System.out.println("El n�mero de espacios es:"+ espacios);
		System.out.println("El n�mero de consonantes:"+ consonantes);
	}
}

