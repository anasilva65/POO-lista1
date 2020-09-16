package Entities;

public class Cliente {
	
	public String nomeCliente;
	public String dataNascimento;
	public String endereco;
	public int telefone;
	public int categoriaInteresse;

	
	public void visualizar() {
		System.out.println("O/a " + nomeCliente + " a sua data de nascimento é " +  dataNascimento + " , vive na " +  endereco + " o seu telefone é " + telefone + " e tem interesse em "+categoriaInteresse);
	}
	
	public int escolha(int categoriaInteresse) 
	{
		if(categoriaInteresse==1)
		{
			System.out.println("O seu interesse é em Acessórios");
			
		}
		else if(categoriaInteresse==2)
		{
			System.out.println("O seu interesse é em Acessórios");
			
		}	
	   else if(categoriaInteresse==3)
	   {
		   System.out.println("O seu interesse é em Acessórios");
			
	   }
		return categoriaInteresse;
		

		
	}
}
