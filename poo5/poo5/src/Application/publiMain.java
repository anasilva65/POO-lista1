package Application;

import java.util.Scanner;

import Entities.Patinete;

public class publiMain {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		
		Patinete patinete1 = new Patinete();
		
		System.out.println(" Digite a marca: ");
		patinete1.marca = tec.nextLine();
		
		System.out.println(" Digite a cor: ");
		patinete1.cor = tec.nextLine();
		
		System.out.println(" Digite o tipo de rodas: ");
		patinete1.rodas = tec.nextLine();
		
		patinete1.mostrarInformacoes();
		tec.close();
	}
}
