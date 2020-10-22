package tools;

import java.util.Scanner;

public class Bolsa {
	
	Producto producto= new Producto(null, 0);

	
	public void crearBolsa() {
		
		int numeroProductos=0;
		System.out.println("¿Cuántos productos quieres?");
		Scanner reader = new Scanner(System.in);
		numeroProductos = reader.nextInt();
				
		for (int i=0; i<numeroProductos; i++ )
		{
			System.out.println("¿Cómo quieres que se llame el producto numero "+i+ "?");
			reader.nextLine();
			producto.nombre= reader.nextLine();
			System.out.println("¿Cuántos quieres del producto "+i+ "?");
			producto.numero= reader.nextInt();
		
		}
		
	}
}
	
