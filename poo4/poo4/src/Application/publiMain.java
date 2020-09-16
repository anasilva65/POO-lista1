package Application;

import java.util.Scanner;

import Entities.Funcionario;

public class publiMain {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		/*
		 * public String nome;
	public String cpf;
	public int idade;
	public String rg;
	public String funcao;
	public String endereco;
	public double salario;
		 */
		
		System.out.println("Digite o nome completo: ");
		funcionario1.nome = tec.nextLine();
		
		System.out.println("Digite o cpf: ");
		funcionario1.cpf = tec.nextLine();
		
		System.out.println("Digite a idade: ");
		funcionario1.idade = tec.nextInt();
		
		System.out.println("Digite o RG: ");
		funcionario1.rg = tec.nextLine();
		
		System.out.println("Digite a função: ");
		funcionario1.funcao = tec.nextLine();
		
		System.out.println("Digite o endereço: ");
		funcionario1.endereco = tec.nextLine();
		
		System.out.println("Digite o salário");
		funcionario1.salario = tec.nextInt();
		
		funcionario1.mostrarInformacoes();
	
		tec.close();
	}

}
