package lista2.trabalhoav1;

public class Exerc032 {
	public static void main(String[] args) {
		int[] vet1 = { 1, 2, 3 };
		int[] vet2 = { 4, 5, 6 };
		int[] vet3 = new int[6];

		for (int i = 0, j = 0; i < vet3.length; i += 2, j++) {
			System.out.println(vet3[i] = vet1[j]);
			System.out.println(vet3[i + 1] = vet2[j]);
		}
	}
}
