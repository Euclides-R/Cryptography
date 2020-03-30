
package cryptography;

import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Stagefinal {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		char ascii;
		String word1, word2;
		String mens; // = "d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr 1d,d";;// frase
						// que reverterá a criptografia

		mens = input1.next();

		int key;// = 3;

		key = input2.nextInt();
		while (key >= 26) {// chave tem que ter o tamanho do alfabeto
			key = key - 26;
		}

		String decrypted = "";

		for (int i = 0; i < mens.length(); i++) {
			char letter = (char) decrypted.charAt(i);
			if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {
				letter = (char) (decrypted.charAt(i) - key);
			}
			decrypted = decrypted + letter;
		}
		System.out.println(decrypted);
	}
}
