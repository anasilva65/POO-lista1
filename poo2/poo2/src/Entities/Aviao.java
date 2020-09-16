package Entities;

public class Aviao {
	public String identificacao;
	public String modelo;
	public int capacPassageiros;
	public int qtdTurbinas;
	public double capacCarga ;
	
	public void voar()
	{
		System.out.println("Cadastro confirmado, verfique informações!");
		System.out.println("\n Número de Identificação: "+ identificacao);
		System.out.println("\n Modelo do Avião: "+ modelo);
		System.out.println("\n Capacidade de Passageiros: "+ capacPassageiros);
		System.out.println("\n Quantidade de Turbinas: "+ qtdTurbinas);
		System.out.println("\n Capacidade de Carga: "+ capacCarga);
	}
}
