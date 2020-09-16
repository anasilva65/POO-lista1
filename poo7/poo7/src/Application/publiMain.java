package Application;

import java.util.Scanner;

import Entities.Paciente;

public class publiMain {
public static void main(String[] args, int sintomas) {
	Scanner tec = new Scanner(System.in);
	
	Paciente paciente1 = new Paciente();
	
	System.out.println("Digite o ID do paciente: ");
	paciente1.idPaciente = tec.nextInt();
	
	System.out.println("Digite o nome completo: ");
	paciente1.nome= tec.nextLine();
	
	System.out.println("Digite a data de cadastro: ");
	paciente1.dataCadastro = tec.nextLine();

	
	System.out.println("Digite a data de nascimento: ");
	paciente1.dataNascimento = tec.nextLine();
	
	System.out.println("Genero digite [para masculino / F para feminino]");
	paciente1.sexo = tec.next().charAt(0);
	
	System.out.println("Sintomas: \nDigite a opção desejada: [1-Febre/2-Dor de cabeça/3-Gripe");
	
	paciente1.sintomas = tec.nextLine();

	
	
	paciente1.cadastro();
	paciente1.mostra();
	paciente1.escolha(sintomas);
	tec.close();
}
}
