package tools;

public class Simetrica {
	public Simetrica() {
		
	}
	public static boolean isSymetric(int matrix[][]){

        if(matrix[1][2] == matrix[2][1] && matrix[1][3] == matrix[3][1] && matrix[2][3] == matrix[3][2]) { return true;}

        else { return false; }

	}
}
