package tools;

import java.util.Scanner;

public class Bolsa {
	
	Producto producto= new Producto(null, 0);

	
	public void crearBolsa() {
		
		int numeroProductos=0;
		System.out.println("�Cu�ntos productos quieres?");
		Scanner reader = new Scanner(System.in);
		numeroProductos = reader.nextInt();
				
		for (int i=0; i<numeroProductos; i++ )
		{
			System.out.println("�C�mo quieres que se llame el producto numero "+i+ "?");
			reader.nextLine();
			producto.nombre= reader.nextLine();
			System.out.println("�Cu�ntos quieres del producto "+i+ "?");
			producto.numero= reader.nextInt();
		
		}
		
	}
}
	
