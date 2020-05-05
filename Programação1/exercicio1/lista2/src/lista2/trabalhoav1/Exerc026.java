package lista2.trabalhoav1;

import java.util.Scanner;

public class Exerc026 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op = 0;

		System.out.println("101 - Raiz Quadrada");
		System.out.println("102 - A metade");
		System.out.println("103 - 10% do número");
		System.out.println("104 - O dobro");
		op = input.nextInt();

		if (op == 101) {
			System.out.println("Digite o número desejado:");
			double number = input.nextDouble();
			System.out.println("A raiz quadrada: " + Math.sqrt(number));
		}
		if (op == 102) {
			System.out.println("Digite o número desejado:");
			double number = input.nextDouble();
			number = number / 2;
			System.out.println("A metade: " + number);
		}
		if (op == 103) {
			System.out.println("Digite o número desejado:");
			double number = input.nextDouble();
			number = number * 0.1;
			System.out.println("10%: " + number);
		}
		if (op == 104) {
			System.out.println("Digite o número desejado:");
			double number = input.nextDouble();
			number = number * 2;
			System.out.println("O dobro: " + number);
		}
		input.close();
	}
}
