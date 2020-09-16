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
		System.out.println("A marca do patinete é: "+marca);
		System.out.println("A cor é: "+cor);
		System.out.println("Os tipos de rodas são: "+rodas);
	}
}
