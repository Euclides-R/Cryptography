package lista1.trabalhoav1;

import java.util.Scanner;

public class Lab04Sistema {

	public static void main(String[] args) {
		Lab04Historico processar01 = new Lab04Historico();
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		int op = 0;
		String yes = null;
		do {
			System.out.println("1 - Cadastro");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Fim");
			System.out.println("5 - Extrato");
			op = in.nextInt();

			switch (op) {
			case 1:
				System.out.println("Numero da agencia: ");
				processar01.setNumAge(in.nextInt());
				System.out.println("Numero da conta: ");
				processar01.setNumConta(in.nextInt());
				System.out.println("Nome do cliente: ");
				processar01.setNome(in.next());
				System.out.println("Saldo: ");
				processar01.setSaldo(in.nextDouble());

				System.out.println("Confirmar Cadastro (S/N): ");
				yes = in.next();
				if (yes.equals("s")) {
					System.out.println("Cadastro Confirmado");
					processar01.setConfirma(true);
					processar01.imprimir();
				} else if (yes.equals("n")) {
					System.out.println("Cadastro Negado");
					processar01.setConfirma(false);
					processar01.imprimir();
				} else {
					System.out.println("Opção inálida");
				}
				break;
			case 2:
				System.out.println("Numero da agencia: ");
				processar01.setNumAge(in.nextInt());
				System.out.println("Numero da conta: ");
				processar01.setNumConta(in.nextInt());
				System.out.println("Valor do Saque: ");
				double saqueSistema = in.nextDouble();
				System.out.println("Confirmar Saque (S/N): ");
				yes = in.next();
				if (yes.equals("s")) {
					System.out.println("Saque Confirmado");
					processar01.saque(saqueSistema);
					processar01.setConfirma(true);
					processar01.imprimir();
				} else if (yes.equals("n")) {
					System.out.println("Saque Negado");
					processar01.setConfirma(false);
					processar01.imprimir();
				} else {
					System.out.println("Opção inálida");
				}
				break;
			case 3:
				System.out.println("Numero da agencia: ");
				processar01.setNumAge(in.nextInt());
				System.out.println("Numero da conta: ");
				processar01.setNumConta(in.nextInt());
				System.out.println("Valor do Depósito: ");
				double depositoSistema = in.nextDouble();
				System.out.println("Confirmar Saque (S/N): ");
				yes = in.next();
				if (yes.equals("s")) {
					System.out.println("Deposito Confirmado");
					processar01.deposito(depositoSistema);
					processar01.setConfirma(true);
					processar01.imprimir();
				} else if (yes.equals("n")) {
					System.out.println("Deposito Negado");
					processar01.setConfirma(false);
					processar01.imprimir();
				} else {
					System.out.println("Opção inálida");
				}
				break;
			case 4:
				System.out.println("Você saiu");
				loop = false;
				break;
			case 5:
				processar01.execExtrato();
				break;
			}
		} while (loop);
		in.close();
	}
}