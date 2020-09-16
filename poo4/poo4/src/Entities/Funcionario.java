package Entities;

public class Funcionario {

	public String nome;
	public String cpf;
	public int idade;
	public String rg;
	public String funcao;
	public String endereco;
	public double salario;

	public void lerInformacoes(String nome, String cpf, int idade, String rg,
			String funcao, String endereco, double salario) 
	{
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.rg = rg;
		this.funcao = funcao;
		this.endereco = endereco;
		this.salario = salario;
	}

	public void mostrarInformacoes() {
		System.out.println("----------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		System.out.println("RG: " + rg);
		System.out.println("Funcao: " + funcao);
		System.out.println("Endereco: " + endereco);
		System.out.println("Salario: " + salario);
}
}
