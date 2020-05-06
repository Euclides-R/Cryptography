package lista3.trabalhoav1;

import java.text.DecimalFormat;

public class Exerc05e06 {
	String marca;
	String cor;
	String modelo;
	int numeroSerie;
	double preco;
	DecimalFormat formatador = new DecimalFormat("0.00");
	
	
	public void imprimir() {
		System.out.println("Marca: "+this.marca);
		System.out.println("Cor: "+this.cor);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Numero de serie: "+this.numeroSerie);
		System.out.println("Preço: R$ "+ formatador.format(this.preco));
	}
	
	public void calcularValor() {
		if (this.marca.equals("hp")) {
			this.preco = (this.preco * 0.30) + this.preco;
		}
		if (this.marca.equals("ibm")) {
			this.preco = (this.preco * 0.50) + this.preco;
		}
	}
	
	public void alterarValor(double valor) {
		if (valor > 0) {
			this.preco = valor;
		}
	}
	
	public static void main(String[] args) {
		Exerc05e06 computador = new Exerc05e06();
		
		computador.marca = "hp";
		computador.cor = "Prata";
		computador.modelo = "slim";
		computador.numeroSerie = 1534789;
		computador.preco = 3215.87;
		computador.calcularValor();
		computador.alterarValor(computador.preco);
		computador.imprimir();
		
	}
}