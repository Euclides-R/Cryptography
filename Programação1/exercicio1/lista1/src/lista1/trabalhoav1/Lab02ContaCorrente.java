package lista1.trabalhoav1;

public class Lab02ContaCorrente {
	public int numAge;
	public int numConta;
	public String nome;
	public double saldo;
	
	public boolean confirma;
	
	public int saque (double pValor) {
		if (this.saldo >= pValor) {
			this.saldo = this.saldo - pValor;
			return 1;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		return 0;
	}
	
	public void deposito (double pValor) {
		this.saldo += + pValor;
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
		return "Lab02ContaCorrente [numAge=" + numAge + ", numConta=" + numConta + ", nome=" + nome + ", saldo=" + saldo
				+ ", confirma=" + confirma + "]";
	}
	
	
}
