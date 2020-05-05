package lista2.trabalhoav1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc023 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		System.out.println("Informe o nome do funcionário: ");
		String nome = input.nextLine();
		System.out.println("Informe a categoria do seu funcionário: ");
		String categoria = input.next();
		System.out.println("Informe o salário do seu funcionário: \nR$ ");
		double salario = input.nextDouble();
		double reajuste = 0;

		if (categoria.equals("a") || categoria.equals("c") || categoria.equals("f") || categoria.equals("h")) {
			reajuste = salario * 0.10;
			salario = salario + reajuste;
			System.out.println("\nFucionário: " + nome + "\nCategoria: " + categoria + "\nSalario com reajuste de 10%: R$ " + formatador.format(salario));
		}
		if (categoria.equals("b") || categoria.equals("d") || categoria.equals("e") || categoria.equals("i") || categoria.equals("j") || categoria.equals("t")) {
			reajuste = salario * 0.15;
			salario = salario + reajuste;
			System.out.println("\nFucionário: " + nome + "\nCategoria: " + categoria + "\nSalario com reajuste de 15%: R$ " + formatador.format(salario));
		}
		if (categoria.equals("k") || categoria.equals("r")) {
			reajuste = salario * 0.25;
			salario = salario + reajuste;
			System.out.println("\nFucionário: " + nome + "\nCategoria: " + categoria + "\nSalario com reajuste de 25%: R$ " + formatador.format(salario));
		}
		if (categoria.equals("l") || categoria.equals("m") || categoria.equals("n") || categoria.equals("o") || categoria.equals("p") || categoria.equals("q") || categoria.equals("s")) {
			reajuste = salario * 0.35;
			salario = salario + reajuste;
			System.out.println("\nFucionário: " + nome + "\nCategoria: " + categoria + "\nSalario com reajuste de 35%: R$ " + formatador.format(salario));
		}
		if (categoria.equals("u") || categoria.equals("v") || categoria.equals("x") || categoria.equals("y") || categoria.equals("w") || categoria.equals("z")) {
			reajuste = salario * 0.50;
			salario = salario + reajuste;
			System.out.println("\nFucionário: " + nome + "\nCategoria: " + categoria + "\nSalario com reajuste de 50%: R$ " + formatador.format(salario));
		}
		
		input.close();
	}
}
