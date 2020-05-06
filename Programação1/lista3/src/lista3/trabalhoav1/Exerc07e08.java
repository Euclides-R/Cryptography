package lista3.trabalhoav1;

import java.util.Scanner;

public class Exerc07e08 {
	Scanner in = new Scanner(System.in);

	int conta;
	int agencia = 1535;
	double saldo;
	String nomeCliente;

	boolean sacar(double valor) {
		if (this.saldo >= valor) {
			return true;
		} else {
			return false;
		}
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void imprimir() {
		System.out.println("Conta: " + this.conta);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Nome do cliente: " + this.nomeCliente);
	}

	public void execSaque() {
		double valor = 0.0;
		System.out.println("Digite o valor que quer sacar: ");
		valor = this.in.nextDouble();
		if (this.sacar(valor) == true) {
			System.out.println("Saque aprovado!");
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public void execDepositar() {
		double valor = 0.0;
		System.out.println("Digite o valor: ");
		valor = this.in.nextDouble();
		this.saldo = this.saldo + valor;
	}
	
	public void execConsultar() {
		this.imprimir();
	}
	
	public void execCadastrar() {
		System.out.println("Nome do Cliente: ");
		this.nomeCliente = this.in.nextLine();
		System.out.println("Saldo Inicial: ");
		this.saldo = this.in.nextDouble();
		System.out.println("Conta: ");
		this.conta = this.in.nextInt();
		this.imprimir();
		System.out.println("Conta criada com sucesso!");
	}

	public static void main(String[] args) {
		Exerc07e08 caixa = new Exerc07e08();
		Scanner input = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Consultar");
			System.out.println("4 - Cadastrar");
			System.out.println("0 - Sair");
			op = input.nextInt();
			switch (op) {
			case 1:
				caixa.execSaque();
				break;
			case 2:
				caixa.execDepositar();
				break;
			case 3:
				caixa.execConsultar();
				break;
			case 4:
				caixa.execCadastrar();
				break;
			case 0:
				System.out.println("Você saiu!");
				break;
			}

		} while (op == 0);
		input.close();
	}

}
