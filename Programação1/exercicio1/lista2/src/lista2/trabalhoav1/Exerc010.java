package lista2.trabalhoav1;

import java.util.Scanner;

public class Exerc010 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor = 0;

		System.out.println("Escreva uma valor: ");
		valor = input.nextInt();
		System.out.println(
				"Resultado ao Quadrado: " + (valor * valor) + "\nResultado ao Cubo: " + (valor * valor * valor));
		input.close();
	}
}
