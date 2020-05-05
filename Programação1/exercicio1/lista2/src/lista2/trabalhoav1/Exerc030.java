package lista2.trabalhoav1;

import java.util.Random;

public class Exerc030 {
	public static void main(String[] args) {
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		
		Random gerador = new Random();
		
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = gerador.nextInt();
		}
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = vet1[i];
		}
	}
}
