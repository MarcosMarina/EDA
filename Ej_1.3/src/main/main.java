package main;

import tools.Plano;
import tools.Punto;
import tools.Suma;
public class main {

	public static void main(String[] args) {
		
		Punto miPunto = new Punto(2,4,7);
		float resultado= miPunto.moduloPuntos();
		
		Suma.sumar(7, 15);
		
		System.out.print(resultado);

	}

}
