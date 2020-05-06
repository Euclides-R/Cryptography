package lista3.trabalhoav1;

public class Exerc01e02 { // apolice

	String nome = "Euclides Rodrigues Junior";
	int idade = 19;
	double valorPremio = 150000;
	String cidade = "Curitiba";
	public void imprimir() {
			System.out.println("Nome: " + this.nome);
			System.out.println("Idade: " + this.idade);
			System.out.println("Valor Prêmio: " + this.valorPremio);
			System.out.println("Cidade: " + this.cidade);
			oferecerDesconto(cidade);
	}
	public void calcularPremioApolice() {
			if ((this.idade >= 18) && (this.idade <= 25)) {
				this.valorPremio += (this.valorPremio * 20) / 100;
			}
			if ((this.idade > 25) && (this.idade <= 36)) {
				this.valorPremio += (this.valorPremio * 15) / 100;
			}
			if (this.idade > 36) {
				this.valorPremio += (this.valorPremio * 10) / 100;
			}
	}
	public void oferecerDesconto(String nomeCidade) {
			if (nomeCidade.equals("Curitiba")) {
				this.valorPremio -= (this.valorPremio * 20) / 100;
			}
			if (nomeCidade.equals("Rio de Janeiro")) {
				this.valorPremio -= (this.valorPremio * 15) / 100;
			}
			if (nomeCidade.equals("São Paulo")) {
				this.valorPremio -= (this.valorPremio * 10) / 100;
			}
			if (nomeCidade.equals("Belo Horizonte")) {
				this.valorPremio -= (this.valorPremio * 5) / 100;
			}
	}
	
	public static void main(String[] args) {
		Exerc01e02 novoObj = new Exerc01e02();
		novoObj.idade = 25;
		novoObj.nome = "Gustavo Baravieira Costa";
		novoObj.valorPremio = 500;
		System.out.println();
		System.out.println("Imprimindo os dados inicializados");
		novoObj.imprimir();
		novoObj.calcularPremioApolice();
		System.out.println();
		System.out.println("Imprimindo os dados após a execução do método calcularPremioApolice");
		novoObj.imprimir();
		novoObj.oferecerDesconto("Curitiba");
		System.out.println();
		System.out.println("Imprimindo os dados após a execução do método oferecerDesconto");
		novoObj.imprimir();

	}
}