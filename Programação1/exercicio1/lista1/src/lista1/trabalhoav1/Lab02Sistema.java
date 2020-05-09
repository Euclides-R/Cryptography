package lista1.trabalhoav1;

import java.util.Scanner;

public class Lab02Sistema {

	public static void main(String[] args) {
		Lab02Sistema processar = new Lab02Sistema();
		Lab02ContaCorrente processar01 = new Lab02ContaCorrente();
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		int op = 0;
		String yes = null;
		do {
			System.out.println("1 - Cadastro");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Fim");
			op = in.nextInt();

			switch (op) {
			case 1:
				System.out.println("Numero da agencia: ");
				processar01.numAge = in.nextInt();
				System.out.println("Numero da conta: ");
				processar01.numConta = in.nextInt();
				System.out.println("Nome do cliente: ");
				processar01.nome = in.next();
				System.out.println("Saldo: ");
				processar01.saldo = 157984.85;

				System.out.println("Confirmar Cadastro (S/N): ");
				yes = in.next();
				if (yes.equals("s")) {
					System.out.println("Cadastro Confirmado");
					processar01.confirma = true;
				} else if (yes.equals("n")) {
					System.out.println("Cadastro Negado");
					processar01.confirma = false;
				} else {
					System.out.println("Opção inálida");
				}
				break;
			case 2:
				System.out.println("Numero da agencia: ");
				processar01.numAge = in.nextInt();
				System.out.println("Numero da conta: ");
				processar01.numConta = in.nextInt();
				System.out.println("Valor do Saque: ");
				double saqueSistema = in.nextDouble();
				System.out.println("Confirmar Saque (S/N): ");
				yes = in.next();
				if (yes.equals("s")) {
					System.out.println("Saque Confirmado");
					processar01.saque(saqueSistema);
					System.out.println("Saldo atual: " + processar01.saldo);
					processar01.confirma = true;
				} else if (yes.equals("n")) {
					System.out.println("Saque Negado");
					processar01.confirma = false;
				} else {
					System.out.println("Opção inálida");
				}
				break;
			case 3:
				System.out.println("Numero da agencia: ");
				processar01.numAge = in.nextInt();
				System.out.println("Numero da conta: ");
				processar01.numConta = in.nextInt();
				System.out.println("Valor do Depósito: ");
				double depositoSistema = in.nextDouble();
				System.out.println("Confirmar Saque (S/N): ");
				yes = in.next();
				if (yes.equals("s")) {
					System.out.println("Deposito Confirmado");
					processar01.deposito(depositoSistema);
					System.out.println("Saldo atual: " + processar01.saldo);
					processar01.confirma = true;
				} else if (yes.equals("n")) {
					System.out.println("Deposito Negado");
					processar01.confirma = false;
				} else {
					System.out.println("Opção inálida");
				}
				break;
			case 4:
				System.out.println("Você saiu");
				loop = false;
				break;
			}
		} while (loop);
		in.close();
	}
}

