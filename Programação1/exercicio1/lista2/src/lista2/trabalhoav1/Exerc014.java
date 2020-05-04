package lista2.trabalhoav1;

import java.util.Scanner;

public class Exerc014 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Velocidade em km/h: ");
		double vel = input.nextDouble();
		double conver = (vel * 10) / 3600;

		double ms = conver * 100;

		System.out.println("Velocidade em m/s:\n " + ms + "m/s");

		input.close();
	}
}
