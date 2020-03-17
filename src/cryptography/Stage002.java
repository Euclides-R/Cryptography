package cryptography;

import java.util.Scanner;

public class Stage002 {

	public void Separar(String Phase) {
		char[] Array = new char[Phase.length()];

		for (int i = 0; i < Phase.length(); i++) {
			Array[i] = Phase.charAt(i);
		}
		
		for (int j = 0; j < Phase.length();j++) {
			System.out.println(Array[j]);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Stage002 chamar = new Stage002();

		System.out.println("Escreva a Frase");
		String Frase = input.next();

		chamar.Separar(Frase);

		input.close();
	}

}
