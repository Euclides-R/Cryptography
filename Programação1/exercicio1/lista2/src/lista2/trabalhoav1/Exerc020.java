package lista2.trabalhoav1;

public class Exerc020 {
	public static void main(String[] args) {
		int mes = 30;
		int ano = 365;
		int dia = 23;
		int dia_atual = 29;
		int ano_nasc = 1993;
		int ano_atual = 2020;
		
		int calc = ano_atual - ano_nasc;
		
		ano = calc * ano;
		
		int calcDia = mes - dia;
		
		int calcDia_atual = mes - dia_atual;
		
		int total = ano + calcDia + calcDia_atual;
		
		System.out.println(total);
		
	}
}
