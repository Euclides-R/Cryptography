package lista3.trabalhoav1;

import java.util.Scanner;

public class Exerc11e12 {
	

	String nomeProduto = "Computador Mesa";
	int valor = 5000;
	int qtde = 10;

	public void imprimir() {
		System.out.println("Nome do Produto: " + this.nomeProduto);
		System.out.println("Valor de cada unidade: R$" + this.valor);
		System.out.println("Quantidade me estoque: " + this.qtde);
	}

	boolean verificarDisponibilidade(double valorQtde) {
		if (this.qtde >= valorQtde) {
			return true;
		} else {
			return false;
		}
	}

	public void removerProdutos(int quantidade) {
		if (this.verificarDisponibilidade(quantidade) == true) {
			qtde = qtde - quantidade;
		} else {
			System.out.println("Estoque tem apenas: " + this.qtde);
		}
	}
	
	public static void main(String[] args) {
		Exerc11e12 chamar = new Exerc11e12();
		Scanner input = new Scanner(System.in);
		
		chamar.imprimir();
		
		System.out.println("Digite a quantidade que deseja remover: ");
		int qtdremover = input.nextInt();
		
		chamar.removerProdutos(qtdremover);
		chamar.imprimir();	
		
		input.close();
	}
}
