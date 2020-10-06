import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		
		int matriz[][] = new int[3][3];
		for (int x=0; x < 3; x++) 
		{
			  for (int y=0; y < 3; y++) 
			  {
			    matriz[x][y] = (int)(Math.random()*9 + 1);
			  }
		}
		
		Scanner entrada =new Scanner (System.in); //LECTURA DE VARIABLES POR TECLADO
		int z = entrada.nextInt();

		
		for (int x=0; x < 3; x++) 
		{
			System.out.print("\n");
			  for (int y=0; y < 3; y++) 
			  {
				  System. out. print(matriz[x][y]+" ");
			  }
		}
		

	}

}
