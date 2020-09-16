package Entities;

public class Celular {
       
	public int numeroModelo;
	public String cor;
	public String marca;
	public int peso;
	public int dimensaoTela;
	public int qtdMemoria;
	
	public void informacoesGerais()
	{
		System.out.println("Número do modelo: "+numeroModelo);
		System.out.println("Cor: "+cor);
		System.out.println("Marca: "+marca);
		System.out.println("Peso: "+peso);
		System.out.println("Dimensão da tela: "+dimensaoTela);
		System.out.println("Quantidade da memória: "+qtdMemoria);
	}
	/*
	 * 
	 * public void fazerLigacao
	 * public void receberLigacao
	 * public void enviarSms
	 */
}
