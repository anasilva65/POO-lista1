package Entities;

public class ContaBancaria {

	public int numero;
    public String nome;
    public double saldo;

    public void conta(int numero, String nome,  double saldo)
    {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;            
    }
    
    public void dados()
    {
    	System.out.println("Dados da conta");
    	System.out.println("============================");
    	System.out.println("Nome Completo: "+nome);
    	System.out.println("Número da Conta: "+numero);
    	System.out.println("Saldo disponível: "+saldo);
    }

    public void Depositar(double valor)
    {
        saldo += valor;
    }

    public void Sacar(double valor)
    {
        saldo -= valor;
    }

    public int numero()
    {
        return numero;
    }

    public String nome()
    {
        return nome;
    }

    public double saldo()
    {
        return saldo;
    }
}
