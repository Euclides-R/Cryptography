package lista2.trabalhoav1;

public class Exerc005 {
	public static void main(String[] args) {
		int ht = 100;
		double vh = 40;
		double pd = 0.8;
		double sb = ht*vh;
		double td = (pd/100)*sb;
		double sl = sb - td;
		System.out.println("Horas trabalhadas: "+ ht + "\nSalário Bruto: " + sb + "\nDesconto: " + pd + "\nSalário Liquido: " + sl);
	}
}
