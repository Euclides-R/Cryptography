package lista3.trabalhoav1;

public class Exerc03e04 {

	String nome;
	String equipe;
	int idade;

	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Equipe: " + this.equipe);
		System.out.println("Idade: " + this.idade);
	}

	public void separarGrupo() {
		if (this.idade >= 6 && this.idade <= 10) {
			this.equipe = "A";
		}
		if (this.idade >= 11 && this.idade <= 20) {
			this.equipe = "B";
		}
		if (this.idade >= 21) {
			this.equipe = "C";
		}
	}
	
	public static void main(String[] args) {
		Exerc03e04 Acampamento = new Exerc03e04();
		Acampamento.nome = "Luiz Henrique Mattos";
		Acampamento.idade = 9;
		Acampamento.separarGrupo();
		Acampamento.imprimir();
	}

}
