package lista1.trabalhoav1;

import java.lang.reflect.Array;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab04Historico {
	Lab04Historico chamar = new Lab04Historico();
	Scanner ler = new Scanner(System.in);
	
	private String nome;
	private double saldo;
	private boolean confirma;
	private int numAge;
	private int numConta;
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;
	private int codHist;
	private double valor;
	vetOperacoes = new ArrayList();

	public void imprimir() {
		NumberFormat formatter = DecimalFormat.getCurrencyInstance(new Locale("pt","BR"));
		formatter.setMinimumFractionDigits(2);
		NumberFormat imprimirAgencia= new DecimalFormat("0000");	
		NumberFormat imprimirConta = new DecimalFormat("0000000");
		
		System.out.println("------------------------------------------");
		System.out.println("\t\t\tSituação da Conta");
		System.out.println("------------------------------------------");
		System.out.println("Agencia		: " + imprimirAgencia.format(this.numAge));
		System.out.println("Conta		: " + imprimirConta.format(this.numConta));
		System.out.println("Nome		: " + this.nome);
		System.out.println("Saldo		: R$ " + formatter.format(this.saldo));
		System.out.println("------------------------------------------");
		this.chamar.recuperarHistorico();
	}
	
	public void execExtrato() {
		System.out.println("Numero da Agencia: ");
		this.numAge = ler.nextInt();
		System.out.println("Numero da Conta: ");
		this.numConta = ler.nextInt();
		this.chamar.imprimir();
	}
	
	public int saque(double pValor) {
		if (this.saldo >= pValor) {
			this.saldo = this.saldo - pValor;
			return 1;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		return 0;
	}

	public void deposito(double pValor) {
		this.saldo += +pValor;
	}

	public boolean removerArquivo() {
		File tArq1;
		tArq1 = new File(numAge + "." + numConta + ".dat");
		tArq1.delete();
		tArq1 = new File(numAge + "." + numConta + ".hist");
		tArq1.delete();
		return true;
	}

	public void recuperarHistorico() {
		FileReader tArq1;
		BufferedReader tArq2;
		String tLinha = null;
		try {
			// Operação I - Abrir o arquivo
			tArq1 = new FileReader(numAge + "." + numConta + ".hist");
			tArq2 = new BufferedReader(tArq1);

			// Operação III - Ler atributo/valor e colocar na matriz

			while (true) {
				tLinha = tArq2.readLine();
				if (tLinha == null)
					break;
					this.vetOperacoes.add(tLinha);
			}
			tArq2.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\n Conta sem movimento \n\n");
		}
		catch (IOException tExcept) 
		{
			tExcept.printStackTrace();
		}
	}

	public boolean gravar(int p_hist, double p_valor) {
		FileWriter tArq1;
		PrintWriter tArq2;
		try {
			// Operação I - Abrir o aquivo
			tArq1 = new FileWriter(numAge + "." + numConta + ".hist", true);
			tArq2 = new PrintWriter(tArq1);

			Date hoje = new Date(p_hist);
			Calendar cal = new GregorianCalendar();
			cal.setTime(hoje);
			this.dia = cal.get(Calendar.DAY_OF_MONTH);
			// O mês em Java inicia com 0
			this.mes = cal.get(Calendar.MONTH) + 1;
			this.ano = cal.get(Calendar.YEAR);
			this.hora = cal.get(Calendar.HOUR);
			this.minuto = cal.get(Calendar.MINUTE);
			this.segundo = cal.get(Calendar.SECOND);

			tArq2.print(numAge + " ");
			tArq2.print(numConta + " ");
			tArq2.print(dia + " ");
			tArq2.print(mes + " ");
			tArq2.print(ano + " ");
			tArq2.print(hora + " ");
			tArq2.print(minuto + " ");
			tArq2.print(segundo + " ");
			tArq2.print(p_hist + " ");
			tArq2.println(p_valor);
			// Operação III - Fechar o arquivo
			tArq2.close();
			return true;
		} catch (IOException tExcept) {
			tExcept.printStackTrace();
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isConfirma() {
		return confirma;
	}

	public void setConfirma(boolean confirma) {
		this.confirma = confirma;
	}

	public int getNumAge() {
		return numAge;
	}

	public void setNumAge(int numAge) {
		this.numAge = numAge;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int getCodHist() {
		return codHist;
	}

	public void setCodHist(int codHist) {
		this.codHist = codHist;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Array[] getVetOperacoes() {
		return vetOperacoes;
	}

	public void setVetOperacoes(Array[] vetOperacoes) {
		this.vetOperacoes = vetOperacoes;
	}

	@Override
	public String toString() {
		return "Lab04Historico [nome=" + nome + ", saldo=" + saldo + ", confirma=" + confirma + ", numAge=" + numAge
				+ ", numConta=" + numConta + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", hora=" + hora
				+ ", minuto=" + minuto + ", segundo=" + segundo + ", codHist=" + codHist + ", valor=" + valor
				+ ", vetOperacoes=" + Arrays.toString(vetOperacoes) + "]";
	}
}
