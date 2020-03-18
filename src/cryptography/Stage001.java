package cryptography;

import java.util.Scanner;

public class Stage001 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		char ascii;
		char word1, word2;
		System.out.println("Digite a mensagem: ");
		String mens = input1.nextLine();
		System.out.println("Digite a CHAVE: ");// chave será um número reverteá a criptografia
		int key = input2.nextInt();
		while (key >= 26) {// chave tem que ter o tamanho do alfabeto
			key = key - 26;
		}
		for (int i = 0; i < mens.length(); i++) {
			if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {// letras minusculas de acordo com a tabela ASCII
				if ((int) (mens.charAt(i) - key) > 122) {
					word1 = (char) (mens.charAt(i) - key);
					word2 = (char) (word1 - 122);
					ascii = (char) (96 + word2);
					System.out.print(ascii + " ");
				} else {
					ascii = (char) (mens.charAt(i) - key);
					System.out.print(ascii + " ");

				}
			}
			if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {// letras maíusculas de acordo com a tabela ASCII
				if (mens.charAt(i) - key > 90) {
					word1 = (char) (mens.charAt(i) - key);
					word2 = (char) (word1 - 90);
					ascii = (char) (64 + word2);
					System.out.print(ascii + " ");
				} else {
					ascii = (char) (mens.charAt(i) - key);
					System.out.print(ascii + " ");
				}
			}
		}
	}

}
