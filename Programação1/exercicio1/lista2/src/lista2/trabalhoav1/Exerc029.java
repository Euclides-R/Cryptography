package lista2.trabalhoav1;

import java.lang.reflect.Array;

public class Exerc029 {
	public static void main(String[] args) {
		int i = 2;
		int[] fib = new int[10];

		fib[0] = 0;
		fib[1] = 1;
		while (fib[i] < 400) {
			i++;
			fib[i] = fib[i - 2] + fib[i - 1];
			System.out.println(fib[i]);
		}
	}
}
