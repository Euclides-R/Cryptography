package lista2.trabalhoav1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc024 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		double diaria = 60.00;
		double taxaServico = 0.0;
		double total = 0.0;

		System.out.println("Digite o nome do cliente: ");
		String nomeCliente = input.nextLine();
		System.out.println("Dias em estadia: ");
		int dias = input.nextInt();

		if (dias > 15) {
			taxaServico = dias * 5.50;
			total = (diaria * dias) + taxaServico;
			System.out.println("Nome do Cliente: " + nomeCliente + "\nDias: " + dias + "\nTotal a ser pago: R$ " + formatador.format(total));
		}
		if (dias == 15) {
			taxaServico = dias * 06.00;
			total = (diaria * dias) + taxaServico;
			System.out.println("Nome do Cliente: " + nomeCliente + "\nDias: " + dias + "\nTotal a ser pago: R$ " + formatador.format(total));
		}
		if (dias < 15) {
			taxaServico = dias * 08.00;
			total = (diaria * dias) + taxaServico;
			System.out.println("Nome do Cliente: " + nomeCliente + "\nDias: " + dias + "\nTotal a ser pago: R$ " + formatador.format(total));
		}

		input.close();
	}
}
