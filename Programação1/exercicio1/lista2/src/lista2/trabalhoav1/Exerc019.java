package lista2.trabalhoav1;

import java.text.DecimalFormat;

public class Exerc019 {
	public static void main(String[] args) {
		String nome[] = new String[3];
		double venda[] = new double[3];
		double comissao[] = new double[3];
		DecimalFormat formatador = new DecimalFormat("0.00");

		nome[0] = "Antonio Rodrigues de Oliveira";
		nome[1] = "Douglas Mendes";
		nome[2] = "Euclides Rodrigues Jr.";

		venda[0] = 51280.75;
		venda[1] = 35759.85;
		venda[2] = 28001.58;

		for (int i = 0; i < 3; i++) {
			if (venda[i] > 50000.00) {
				comissao[i] = venda[i] * 0.12;
			}
			if (venda[i] < 50000.00 && venda[i] > 30000.00) {
				comissao[i] = venda[i] * 0.09;
			}
			if (venda[i] < 30000.00) {
				comissao[i] = venda[i] * 0.07;
			}
		}

		double total = venda[0] + venda[1] + venda[2];

		for (int i = 0; i < 3; i++) {
			System.out.println("Nome do funcionário: " + nome[i]);
			System.out.println("Venda do funcionário: R$ " + formatador.format(venda[i]));
			System.out.println("Comissão do funcionário: R$ " + formatador.format(comissao[i]) + "\n");
		}
		
		System.out.println("Venda total da empresa: R$ " + formatador.format(total));
	}
}
