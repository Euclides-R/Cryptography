package lista2.trabalhoav1;

import java.util.Random;

public class Exerc034 {
	public static void main(String[] args) {
		double A[][] = new double[3][3];
		double B[][] = new double[3][3];
		double C[][] = new double[3][3];
		
		Random gerador = new Random();
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				A[i][j] = gerador.nextDouble();
				B[i][j] = gerador.nextDouble();
			}	
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < C.length; j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.println(C[i][j] + "\n");
			}
		}
	}
}
