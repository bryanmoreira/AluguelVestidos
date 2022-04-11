package com.bryan.lojaAluguel;

import java.util.Scanner;

public class VestidoDebutante extends CadastroVestido {
	String uso;
	
	public void cadastrarVestDebutante(Scanner entrada) {
		System.out.println("Informe o uso do vestido: ");
		uso = entrada.nextLine();
	}

}
