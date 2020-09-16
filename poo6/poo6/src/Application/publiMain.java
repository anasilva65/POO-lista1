package Application;

import java.util.Scanner;

import Entities.ContaBancaria;

public class publiMain {
	
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	ContaBancaria contabancaria1 = new ContaBancaria();
	
	System.out.println("Digite o nome completo: ");
	contabancaria1.nome = tec.next();
	
	System.out.println("Digite o número da conta: ");
	contabancaria1.numero = tec.nextInt();
	
	
	contabancaria1.dados();
	contabancaria1.saldo();
	
	tec.close();
}
}
