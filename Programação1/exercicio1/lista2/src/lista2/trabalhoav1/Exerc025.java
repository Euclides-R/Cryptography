package lista2.trabalhoav1;

import java.util.Scanner;

public class Exerc025 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op = 0;
		double total = 0.0;
		double total1 = 0.0;
		double total2 = 0.0;
		double total3 = 0.0;
		double total4 = 0.0;
		double total5 = 0.0;
		double total6 = 0.0;
		int qtde = 0;

		
			System.out.println("100 - Cachorro Quente		: R$ 01,10");
			System.out.println("101 - Bauru Simples		: R$ 01,30");
			System.out.println("102 - Bauru c/ ovo		: R$ 01,50");
			System.out.println("103 - Hamburguer		: R$ 01,10");
			System.out.println("104 - Cheeseburguer		: R$ 01,30");
			System.out.println("105 - Refrigerante		: R$ 01,00");
			System.out.println("111 - Total da compra");
			System.out.println("000 - Sair");
			op = input.nextInt();
		do {
			if (op == 100) {
				System.out.println("Quantidade: ");
				qtde = input.nextInt();
				total1 = qtde * 1.1;
			}
			if (op == 101) {
				System.out.println("Quantidade: ");
				qtde = input.nextInt();
				total2 = qtde * 1.3;
			}
			if (op == 102) {
				System.out.println("Quantidade: ");
				qtde = input.nextInt();
				total3 = qtde * 1.5;
			}
			if (op == 103) {
				System.out.println("Quantidade: ");
				qtde = input.nextInt();
				total4 = qtde * 1.1;
			}
			if (op == 104) {
				System.out.println("Quantidade: ");
				qtde = input.nextInt();
				total5 = qtde * 1.3;
			}
			if (op == 105) {
				System.out.println("Quantidade: ");
				qtde = input.nextInt();
				total6 = qtde * 1;
			}
			if (op == 111) {
				total = total1 + total2 + total3 + total4 + total5 + total6;
				System.out.println("Total a ser pago: " + total);
			}
		} while (op == 000);

		input.close();
	}
}
