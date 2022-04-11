package com.bryan.lojaAluguel;

import java.util.Scanner;

public class CadastroVestido extends Estoque{
	String modelo;
	String comprimento;

	public void cadastrarVestido(Scanner entrada) {
	
		entrada.nextLine();
		System.out.println("Informe o modelo do vestido: ");
		modelo = entrada.nextLine();
		
		System.out.println("Informe o comprimento da roupa: ");
		comprimento = entrada.nextLine();
 	}
	
}