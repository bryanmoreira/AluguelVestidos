package com.bryan.lojaAluguel;

import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		CadastroClientes cliente = new CadastroClientes();
		
		VestidoNoiva noiva = new VestidoNoiva();
		VestidoDebutante debutante = new VestidoDebutante();
		VestidoMadrinha madrinha = new VestidoMadrinha();
		
		System.out.println("Escolha conforme as op��es:");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Cadastrar vestido de noiva");
		System.out.println("3 - Cadastrar vestido de madrinha");
		System.out.println("4 - Cadastrar vestido de debutante");
		
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Cadastrando cliente...");
			cliente.cadastrarClientes(entrada);
			System.out.println("Dados do cliente cadastrado:");
			System.out.println("Nome: " + cliente.nome);
			System.out.println("CPF: " + cliente.CPF);
			System.out.println("Telefone: " + cliente.telefone);
			System.out.println("Endere�o: " + cliente.endereco);
			System.out.println("ID do cliente: " + cliente.cliente);
		break;
		case 2:
			System.out.println("Cadastrando vestido de noiva");
			noiva.cadastroRoupa(entrada);
			noiva.cadastrarVestido(entrada);
			noiva.CadastrarVestNoiva(entrada);
			System.out.println("Dados do vestido cadastrado:");
			System.out.println("ID: " + noiva.ID);
			System.out.println("Quantidade: " + noiva.quantidade);
			System.out.println("Cor: " + noiva.cor);
			System.out.println("Classifica��o: " + noiva.classificacao);
			System.out.println("Modelo: " + noiva.modelo);
			System.out.println("Comprimento: " + noiva.comprimento);
			System.out.println("Cauda: " + noiva.cauda);
			System.out.println("V�u: " + noiva.veu);
		break;
		case 3:
			System.out.println("Cadastrando vestido de noiva");
			madrinha.cadastroRoupa(entrada);
			madrinha.cadastrarVestido(entrada);
			madrinha.cadastrarVestMadrinha(entrada);
			System.out.println("Dados do vestido cadastrado:");
			System.out.println("ID: " + madrinha.ID);
			System.out.println("Quantidade: " + madrinha.quantidade);
			System.out.println("Cor: " + madrinha.cor);
			System.out.println("Classifica��o: " + madrinha.classificacao);
			System.out.println("Modelo: " + madrinha.modelo);
			System.out.println("Comprimento: " + madrinha.comprimento);
			System.out.println("Hora da festa: " + madrinha.horaFesta);
		break;
		case 4:
			System.out.println("Cadastrando vestido de noiva");
			debutante.cadastroRoupa(entrada);
			debutante.cadastrarVestido(entrada);
			debutante.cadastrarVestDebutante(entrada);
			System.out.println("Dados do vestido cadastrado:");
			System.out.println("ID: " + debutante.ID);
			System.out.println("Quantidade: " + debutante.quantidade);
			System.out.println("Cor: " + debutante.cor);
			System.out.println("Classifica��o: " + debutante.classificacao);
			System.out.println("Modelo: " + debutante.modelo);
			System.out.println("Comprimento: " + debutante.comprimento);
			System.out.println("Hora da festa: " + debutante.uso);
		break;
	
		}

	}
}
