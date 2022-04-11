package com.bryan.lojaAluguel;

import java.util.Scanner;

public class VestidoMadrinha extends CadastroVestido {
	String horaFesta;
	
	public void cadastrarVestMadrinha(Scanner entrada) {
		System.out.println("Informe a hora da festa: ");
		horaFesta = entrada.nextLine();
		
	}

}
