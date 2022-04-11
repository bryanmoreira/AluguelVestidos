package com.bryan.lojaAluguel;

import java.util.Scanner;

public class VestidoNoiva extends CadastroVestido {
	String cauda;
	String veu;
	
	public void CadastrarVestNoiva(Scanner entrada) {
		System.out.println("Possui cauda: ");
		cauda = entrada.nextLine();
		
		System.out.println("Possui véu: ");
		veu = entrada.nextLine();
		
	}

}
