package Application;

import java.util.Scanner;

import Entities.Cliente;

public class publicMain {
	public static void main(String[] args) {
		
	
   Scanner tec = new Scanner(System.in);
   
   Cliente cliente1 = new Cliente();
   
  System.out.println("Digite o seu nome completo: ");
  cliente1.nomeCliente = tec.nextLine();
  
 
  System.out.println("Digite a data de nascimento: " );
  cliente1.dataNascimento = tec.nextLine();
  
  System.out.println("Digite o seu endereço completo: ");
  cliente1.endereco = tec.nextLine();
  
  System.out.println("Digite o telefone: ");
  cliente1.telefone = tec.nextInt();
  
  
  System.out.println("Digite a categoria de interesse: 1-acessorios, 2-maquiagem, 3-eletronicos ");
  cliente1.categoriaInteresse = tec.nextInt();
  
 cliente1.visualizar();
   tec.close();
   
	}  
}
