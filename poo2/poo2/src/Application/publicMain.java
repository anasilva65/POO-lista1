package Application;

import java.util.Scanner;

import Entities.Aviao;

public class publicMain {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		Aviao aviao1 = new Aviao();
		
		System.out.println("Digite os dados do avi�o : ");
		
		System.out.println("                Cadastro de voos               ");
		System.out.println("==========================================================");
		System.out.println("N�mero de identifica��o do avi�o: ");
		aviao1.identificacao = tec.nextLine();
		
		System.out.println("Modelo do avi�o: ");
		aviao1.modelo = tec.nextLine();
		
		System.out.println("Capacidade de passageiros exigida: ");
		aviao1.capacPassageiros = tec.nextInt();
		
		System.out.println("Quantidade de turbinas: ");
		aviao1.qtdTurbinas = tec.nextInt();
		
		System.out.println("Capacidade de carga");
		aviao1.capacCarga = tec.nextDouble();
		
		aviao1.voar();
		
		tec.close();
	}

}
