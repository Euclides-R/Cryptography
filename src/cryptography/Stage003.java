package cryptography;

import java.util.Random;
import java.util.Scanner;

public class Stage003 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random ale = new Random();

		for (int i = 0; i < 10; i++) {
			int number = ale.nextInt(10);
			System.out.println(number);
		}

		input.close();

	}
}
