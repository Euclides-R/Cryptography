package lista2.trabalhoav1;

import java.util.Scanner;

public class Exerc027 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = 2;
		
		for (int i = 0; i < 14; i++) {
			System.out.print("Tabuada do: ");
			System.out.print(i + " x " + numero + " = ");
			System.out.println(i * numero);
		}
		
		input.close();
	}
}
