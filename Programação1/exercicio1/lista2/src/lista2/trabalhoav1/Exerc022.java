package lista2.trabalhoav1;

public class Exerc022 {
	public static void main(String[] args) {
		int um = 1;
		int dez = 10;
		int cem = 100;
		int compra = 294;

		int trocoNotascem = compra / 100;
		int trocoNotasdez = (compra - trocoNotascem * 100) / 10;
		int trocoNotasum = (compra - trocoNotascem * 100) - (trocoNotasdez * 10) / 1;

		System.out.println("Troco em notas de R$ 100,00 quantidade: " + trocoNotascem);
		System.out.println("\nTroco em notas de R$ 10,00 quantidade: " + trocoNotasdez);
		System.out.println("\nTroco em notas de R$ 01,00 quantidade: " + trocoNotasum);

	}
}
