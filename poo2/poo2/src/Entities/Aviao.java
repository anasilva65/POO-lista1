package Entities;

public class Aviao {
	public String identificacao;
	public String modelo;
	public int capacPassageiros;
	public int qtdTurbinas;
	public double capacCarga ;
	
	public void voar()
	{
		System.out.println("Cadastro confirmado, verfique informa��es!");
		System.out.println("\n N�mero de Identifica��o: "+ identificacao);
		System.out.println("\n Modelo do Avi�o: "+ modelo);
		System.out.println("\n Capacidade de Passageiros: "+ capacPassageiros);
		System.out.println("\n Quantidade de Turbinas: "+ qtdTurbinas);
		System.out.println("\n Capacidade de Carga: "+ capacCarga);
	}
}
