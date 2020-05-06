package lista3.trabalhoav1;

import java.util.Scanner;

public class Exerc09e10 {
	String nome;
	int idade;

	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}

	public void verificar() {
		if (this.idade < 16) {
			System.out.println("Não deve votar!");
		}
		if (this.idade >= 16 && this.idade <= 65) {
			System.out.println("Deve votar!");
		}
		if (this.idade > 65) {
			System.out.println("Voto facultativo!");
		}
	}
	
	public static void main(String[] args) {
		Exerc09e10 votar = new Exerc09e10();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nome: ");
		votar.nome = in.nextLine();
		System.out.println("idade: ");
		votar.idade = in.nextInt();
		
		votar.verificar();
		votar.imprimir();
		
		in.close();
	}
}
