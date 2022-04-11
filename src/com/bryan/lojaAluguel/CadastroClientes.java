package com.bryan.lojaAluguel;

import java.util.Scanner;

public class CadastroClientes {
	String nome;
	String CPF;
	String telefone;
	String endereco;
	int cliente;
	
	public void cadastrarClientes(Scanner entrada) {
		
		entrada.nextLine();
		
		System.out.println("Informe o nome do cliente: ");
		nome = entrada.nextLine();
		
		System.out.println("Informe o CPF: ");
		CPF = entrada.nextLine();
		
		System.out.println("Informe o telefone: ");
		telefone = entrada.nextLine();
		
		System.out.println("Informe o endereço: ");
		endereco = entrada.nextLine();
		
		System.out.println("Informe o ID do cliente: ");
		cliente = entrada.nextInt();
	}
	
}
