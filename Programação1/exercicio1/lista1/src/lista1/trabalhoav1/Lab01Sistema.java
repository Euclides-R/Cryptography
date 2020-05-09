package lista1.trabalhoav1;

import java.util.Scanner;

public class Lab01Sistema {

	Scanner input = new Scanner(System.in);

	public int agencia = 1537;
	public int conta = 0;
	public double saldo = 120000;
	public String nome_cliente = null;
	public boolean confirmar = true;

	public void execCadastramento() {
		String yes = null;
		System.out.println("Numero da conta: ");
		this.conta = this.input.nextInt();
		System.out.println("Nome do cliente: ");
		this.nome_cliente = this.input.next();
		System.out.println("Saldo: " + this.saldo);
		this.saldo = 11112.5;

		System.out.println("Confirmar Cadastro (S/N): ");
		yes = this.input.next();
		if (yes.equals("s")) {
			System.out.println("Cadastro Confirmado");
			this.confirmar = true;
		} else if (yes.equals("n")) {
			System.out.println("Cadastro Negado");
			this.confirmar = false;
		} else {
			System.out.println("Opção inálida");
		}
	}

	public void execSaque() {
		String yes = null;
		System.out.println("Numero da agencia: ");
		this.agencia = this.input.nextInt();
		System.out.println("Numero da conta: ");
		this.conta = this.input.nextInt();
		System.out.println("Valor do Saque: ");
		double saque = this.input.nextDouble();
		System.out.println("Confirmar Saque (S/N): ");
		yes = this.input.next();
		if (yes.equals("s")) {
			System.out.println("Saque Confirmado");
			this.saldo = this.saldo - saque;
			System.out.println("Saldo atual: " + this.saldo);
			this.confirmar = true;
		} else if (yes.equals("n")) {
			System.out.println("Saque Negado");
			this.confirmar = false;
		} else {
			System.out.println("Opção inálida");
		}
	}

	public void execDeposito() {
		String yes = null;
		System.out.println("Numero da agencia: ");
		this.agencia = this.input.nextInt();
		System.out.println("Numero da conta: ");
		this.conta = this.input.nextInt();
		System.out.println("Valor do Depósito: ");
		double deposito = this.input.nextDouble();
		System.out.println("Confirmar Saque (S/N): ");
		yes = this.input.next();
		if (yes.equals("s")) {
			System.out.println("Deposito Confirmado");
			this.saldo = this.saldo + deposito;
			System.out.println("Saldo atual: " + this.saldo);
			this.confirmar = true;
		} else if (yes.equals("n")) {
			System.out.println("Deposito Negado");
			this.confirmar = false;
		} else {
			System.out.println("Opção inálida");
		}
	}

	public static void main(String[] args) {
		Lab01Sistema processar = new Lab01Sistema();
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		int op = 0;
		do {
			System.out.println("1 - Cadastro");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Fim");
			op = in.nextInt();

			switch (op) {
			case 1:
				processar.execCadastramento();
				break;
			case 2:
				processar.execSaque();
				break;
			case 3:
				processar.execDeposito();
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
