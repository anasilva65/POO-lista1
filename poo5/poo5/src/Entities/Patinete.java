package Entities;

public class Patinete {

	public String marca;
	public String cor;
	public String rodas;
	
	public void lerInformacoes()
	{
		this.marca = marca;
		this.cor = cor;
		this.rodas = rodas;
	}
	
	public void mostrarInformacoes()
	{
		System.out.println("A marca do patinete �: "+marca);
		System.out.println("A cor �: "+cor);
		System.out.println("Os tipos de rodas s�o: "+rodas);
	}
}
