package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args)

	{
		Scanner leia = new Scanner(System.in);

		int estoque[] = new int[10];
		int codigos[] = new int[10];
		double precoUnitarios[] = { 10, 10, 10, 10, 10, 10, 15, 15, 15, 15 };
		String produtos[] = { "Capim-Limão", "Laranja", "Lavanda", "Doce", "Cravo&Canela", "Floral", "Maracujá",
				"Algodão", "Eucalipto", "Soft" };

		char sOUn = 's';

		inserirLinha(80, "■");
		System.out.println("                             CHEIRIN DE CAPIM ");
		inserirLinha(80, "■");
		System.out.println();

		System.out.println("         █■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■   [1] ▶ COMPRAR PRODUTOS    ■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■   [2] ▶ GERENCIAR ESTOQUE   ■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■   [3] ▶ SAIR                ■■■■■■■■■■■■■■█");
		System.out.println("         █■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■█");
		System.out.print("                              DIGITE A OPÇÃO: ");
		System.out.print(" \n");
		inserirLinha(80, "■");
		char opcaoMenu = leia.next().charAt(0); //
		inserirLinha(80, "■");
		switch (opcaoMenu) {

		case '1':
			leia.nextLine();
			System.out.print("Por favor informe o seu nome: ");
			String nomeCliente = leia.nextLine();
			inserirLinha(80, "■");
			System.out.print("Você se define como M-masculino, F-feminino ou O-outro :");
			char generoCliente = leia.next().toUpperCase().charAt(0);
			inserirLinha(80, "■");
			System.out.println(boasVindas(generoCliente, nomeCliente));
			inserirLinha(80, "■");

			break;

		case '2':
			System.out.println("WIP");
			break;

		case '3':
			System.out.println("Volte sempre!!!");
			break;

		}
		System.out.println("Deseja continuar?");
		sOUn = leia.next().toUpperCase().charAt(0);

		System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
		inserirLinha(80, "■");

		for (int x = 0; x < 10; x++) {
			codigos[x]= (x+1);
			estoque[x] = 10;
			System.out.printf("%s\t\t%.2f\t\t%d\t%s\n", codigos[x], precoUnitarios[x], estoque[x],"Aroma "+produtos[x]);
			
		}
		inserirLinha(80, "■");
		System.out.println("\nInsira o código do produto para adicioná-lo ao carrinho:");

	}

	public static String boasVindas(char generoCliente, String nomeCliente) {

		String saudacao;

		if (generoCliente == 'M') {
			saudacao = "Seja bem-vindo " + nomeCliente + "!";
		} else if (generoCliente == 'F') {
			saudacao = "Seja bem-vinda " + nomeCliente + "!";
		} else if (generoCliente == 'O') {
			saudacao = "Seja bem-vinde " + nomeCliente + "!";
		} else {
			saudacao = "Erro";
		}
		return saudacao;
	}

	public static void inserirLinha(int tamanho, String simbolo) {

		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}

}