package lista1.trabalhoav1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab03ContaCorrente {
	private int numAge;
	private int numConta;
	private String nome;
	private double saldo;
	private boolean confirma;

	public void imprimir() {
		System.out.println("------------------------------------------");
		System.out.println("\t\t\tSituação da Conta");
		System.out.println("------------------------------------------");
		System.out.println("Agencia		: " + this.numAge);
		System.out.println("Conta		: " + this.numConta);
		System.out.println("Nome		: " + this.nome);
		System.out.println("Saldo		: R$ " + this.saldo);
		System.out.println("------------------------------------------");
	}

	public boolean gravar() {
		FileWriter tArq1;
		PrintWriter tArq2;

		try {
			// Operação I - Abrir o aquivo
			tArq1 = new FileWriter(getNumAge() + "." + getNumConta() + ".dat");
			tArq2 = new PrintWriter(tArq1);

			tArq2.println(getNumAge());
			tArq2.println(getNumConta());
			tArq2.println(getNome());
			tArq2.println(getSaldo());
			// Operação III - Fechar o arquivo
			tArq2.close();

			return true;
		} catch (IOException tExcept) {
			tExcept.printStackTrace();
			return false;
		}

	}

	private void recuperar() {
		FileReader tArq1;
		BufferedReader tArq2;
		int tQtde = 4;
		try {
			// Operação I - Abrir o arquivo
			tArq1 = new FileReader(getNumAge() + "." + getNumConta() + ".dat");
			tArq2 = new BufferedReader(tArq1);
			// Operação III - Ler atributo/valor e colocar na matriz
			String[] tLinha = new String[tQtde];
			for (int i = 0; i < tQtde; i++) {
				tLinha[i] = tArq2.readLine();
			}
			// Operação IV - Fechar o arquivo
			tArq2.close();
			setNumAge(Integer.parseInt(tLinha[0]));
			setNumConta(Integer.parseInt(tLinha[1]));
			setNome(tLinha[2]);
			setSaldo(Double.parseDouble(tLinha[3]));
		} catch (IOException tExcept) {
			tExcept.printStackTrace();
		}

	}

	public int saque(double pValor) {
		if (this.saldo >= pValor) {
			this.saldo = this.saldo - pValor;
			return 1;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		return 0;
	}

	public void deposito(double pValor) {
		this.saldo += +pValor;
	}

	public int getNumAge() {
		return numAge;
	}

	public void setNumAge(int numAge) {
		this.numAge = numAge;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isConfirma() {
		return confirma;
	}

	public void setConfirma(boolean confirma) {
		this.confirma = confirma;
	}

	@Override
	public String toString() {
		return "Lab03ContaCorrente [numAge=" + numAge + ", numConta=" + numConta + ", nome=" + nome + ", saldo=" + saldo
				+ ", confirma=" + confirma + "]";
	}
}