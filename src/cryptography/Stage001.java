package cryptography;

import java.util.Scanner;

public class Stage001 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserir a frase: ");		
		String Frase = input.next(); //Para inserir valor a string	
		
		System.out.println(Frase);
		
		input.close();

	}

}
