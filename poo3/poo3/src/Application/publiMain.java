package Application;

import java.util.Scanner;

import Entities.Celular;

public class publiMain {
public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	Celular celular1 = new Celular();
	
	System.out.println("               Digite os dados do seu celular ");
	System.out.println("=============================================================");
	
	System.out.println("Digite o n�mero do modelo: ");
	celular1.numeroModelo = tec.nextInt();
	
	System.out.println("Qual � a cor ? ");
	celular1.cor = tec.nextLine();
	
	System.out.println("Qual � a marca ? ");
	celular1.marca = tec.nextLine();
	
	System.out.println("Digite o peso do modelo: ");
	celular1.peso = tec.nextInt();
	
	System.out.println("Digite a dimens�o da tela: ");
	celular1.dimensaoTela = tec.nextInt();
	
	System.out.println("Digite a quantidade da mem�ria: ");
	celular1.qtdMemoria = tec.nextInt();
	
	celular1.informacoesGerais();
	
	tec.close();
}
}
