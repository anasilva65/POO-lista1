package Entities;

public class Paciente {
	
    public int idPaciente;
    public String nome;
    public String dataCadastro;
    public String dataNascimento;
    public char sexo;
    public String sintomas;
   
    
    public void cadastro()
    {
    	System.out.println("Verifique a sua ficha!");
    	System.out.println("\nID: "+idPaciente);
    	System.out.println("Nome completo: "+nome);
    	System.out.println("\nData do cadastro: "+dataCadastro);
    	System.out.println("/nData de nascimento: "+dataNascimento);
    	
    	
    }
    
    public void mostra()  
	{
		
		if (sexo == 'M')
		{
			System.out.printf("O nome do paciente é %s do sexo %s", nome, sexo);
		}
		else if (sexo =='F')
		{
			System.out.printf("O nome da paciente é %s do sexo %s", nome, sexo);
		}
	}
    
    public int escolha(int sintomas)
    {
    	if(sintomas==1)
		{
			System.out.println("Sintoma cadastrado!");
			
		}
		else if(sintomas==2)
		{
			System.out.println("Sintoma cadastrado!");
			
		}	
	   else if(sintomas==3)
	   {
		   System.out.println("Sintoma cadastrado!");
			
	   }
		return sintomas;
		
    }
    
		
    }
    
    

