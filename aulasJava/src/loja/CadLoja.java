package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args)

	{
		Scanner leia = new Scanner(System.in);

		// Variaveis

		int estoque[] = new int[10];
		int qntdCompra = 0;
		int carrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int qntd[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		double precoUnitarios[] = { 10, 10, 10, 10, 10, 10, 15, 15, 15, 15 };
		double precoTotal;
		char sOUn = 's', continuaCompra;
		int codigos[] = new int[10];
		String produtos[] = { " Capim-Limão", " Laranja", " Lavanda", " Doce", " Cravo&Canela", "Floral", " Maracujá",
				" Algodão", " Eucalipto", " Soft" };
		int produtoEscolhido;
		String escolha; 
		String compararProduto; // para usar no equals

		
		
		
		
		inserirLinha(80, "■");
		System.out.println("\n                               CHEIRIN DE CAPIM \n");
		inserirLinha(80, "■");
		System.out.println();

		System.out.println("         █                [1] ▶ COMPRAR PRODUTOS                  █");
		System.out.println("         █                [2] ▶ GERENCIAR ESTOQUE                 █");
		System.out.println("         █                [3] ▶ SAIR                              █");

		System.out.print(" \n");
		inserirLinha(80, "■");
		System.out.print("\n                              DIGITE A OPÇÃO:\n\n");

		inserirLinha(80, "■");
		System.out.print(" \n");

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
			codigos[x] = x + 1;
			estoque[x] = 10;
			System.out.printf("%s\t\t%.2f\t\t%d\t%s\n", codigos[x], precoUnitarios[x], estoque[x],
					"Aroma " + produtos[x]);

		}
		inserirLinha(80, "■");
		System.out.printf("\nInsira o código do produto para adicioná-lo ao carrinho:");
		escolha = leia.next().toUpperCase();
		produtoEscolhido = leia.nextInt();

		for (int x = 0; x < 10; x++) {
			
			if(codigos[x].equals(escolha)) {
				produtoEscolhido = x;
				System.out.printf("O produto selecionado foi: " + x);
			}
		}

		System.out.println("Insira a quantidade: ");
		qntdCompra = leia.nextInt();
		while (qntdCompra < 0) {
			System.out.println("Valor incorreto. Digite a quantidade desejada: ");
			qntdCompra = leia.nextInt();
		}
		for (int x = 0; x < estoque[10]; x++) {
			if (compararProduto.equals(codigos[x])) {
				if (qntd[x] >= qntdCompra) {
					carrinho[x] = carrinho[x] + qntdCompra;
					precoTotal = precoTotal + (qntdCompra * precoUnitarios[x]);
					qntd[x] = qntd[x] - qntdCompra;
				} else {
					System.out.printf("Estoque disponível: %d", qntd[x]);
				}
			}
		}
		System.out.print("\n\nDeseja mais algo? 'S'para Sim 'N' para Não)? ");
		continuaCompra = leia.next().toUpperCase().charAt(0);
		while (continuaCompra != 'S' && continuaCompra != 'N') {
			System.out.print("\nOpção inválida. Deseja adquirir mais algum produto? 'S' para Sim 'N' para Não. ");
			continuaCompra = leia.next().toUpperCase().charAt(0);
		}

		while (continuaCompra == 'S');

		// se não, emite nota fiscal

		System.out.println("\n\t\t\t   NOTA FISCAL");
		System.out.println("CÓDIGO\t  PRODUTO\t  QUANTIDADE\t  VALOR UN.(R$)\t  VALORITEM(R$)");
		inserirLinha(80, "■");
		for (int x = 0; x < estoque; x++) {
			if (carrinho[x] > 0) {
				System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", codigos[x], produtos[x], carrinho[x],
						precoUnitarios[x], precoUnitarios[x] * carrinho[x]);
			}
		}
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