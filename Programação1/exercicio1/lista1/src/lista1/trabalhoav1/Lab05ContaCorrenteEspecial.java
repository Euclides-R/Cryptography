package lista1.trabalhoav1;

public class Lab05ContaCorrenteEspecial {

	
	public boolean removerArquivo () 
	{
		super.removerArquivo ();
		File      tArq1;
		tArq1 = new File (getNum_age() + "." + getNum_conta() + ".esp");
		tArq1.delete();
		return true;
	}

}
