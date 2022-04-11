package com.bryan.lojaAluguel;

import java.util.Scanner;

public class Estoque {
	int ID;
	String classificacao;
	String cor;
	int quantidade;
	
	public void cadastroRoupa (Scanner entrada) {
		System.out.println("Informe o ID da roupa: ");
		ID = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Informe a classificação da roupa: ");
		classificacao = entrada.nextLine();
		
		System.out.println("Informe a cor da roupa: ");
		cor = entrada.nextLine();
		
		System.out.println("Informe as quantidades da roupa: ");
		quantidade = entrada.nextInt();
	}
}
