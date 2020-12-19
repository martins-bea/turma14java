package loja;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadLoja {

	public static void main(String[] args)

	{
		Scanner leia = new Scanner(System.in);
		List<Produtos> ListaProdutos = new ArrayList();
		List<Produtos> Carrinho = new ArrayList();
		
		// Variaveis

	
		int quantidadeVenda = 0, notaFiscal=20200;
		String produtoEscolhido; 
		int anoAtual=2020;
		double valorCompra=0;
		char continuaCompra;
		
		
		//ARRAYLIST AQUI ListaProdutos.add(new Produto("Ar-01", "Capim-Limão", 10.00, 10))
		
		ListaProdutos.add(new Produtos("AR01", "Aroma Capim-Limão", 10.00, 10));
		ListaProdutos.add(new Produtos("AR02", "Aroma Laranja    ", 10.00, 10));
		ListaProdutos.add(new Produtos("AR03", "Aroma Lavanda    ", 10.00, 10));
		ListaProdutos.add(new Produtos("AR04", "Aroma Doce       ", 10.00, 10));
		ListaProdutos.add(new Produtos("AR05", "Aroma Cravo&Canela", 10.00, 10));
		ListaProdutos.add(new Produtos("AR06", "Aroma Floral      ", 10.00, 10));
		ListaProdutos.add(new Produtos("AR07", "Aroma Camomila    ", 10.00, 10));
		ListaProdutos.add(new Produtos("AR08", "Aroma Algodão     ", 10.00, 10));
		ListaProdutos.add(new Produtos("AR09", "Aroma Eucalipto   ", 10.00, 10));
		ListaProdutos.add(new Produtos("AR10", "Aroma Soft        ", 10.00, 10));
		
		
		inserirLinha(80, "■");
		System.out.println("\n                          ꕥ CHEIRIN DE CAPIM ꕥ \n");
		inserirLinha(80, "■");
		System.out.println();

		System.out.println("                        [1] ▶ COMPRAR PRODUTOS                ");
		System.out.println("                        [2] ▶ GERENCIAR ESTOQUE                ");
		System.out.println("                        [3] ▶ SAIR                             ");

		System.out.print(" \n");
		System.out.print("\n                          DIGITE A OPÇÃO:\n\n");

		inserirLinha(80, "■");
		System.out.print(" \n");

		char opcaoMenu = leia.next().charAt(0); //
		inserirLinha(80, "■");
		switch (opcaoMenu) {

		case '1':
			leia.nextLine();
			System.out.print("Realize seu cadastro!\n");
			System.out.print("\nNome: ");
			String nomeCliente = leia.nextLine();
			System.out.print("\nGênero: M-masculino, F-feminino ou O-outro:");
			char generoCliente = leia.next().toUpperCase().charAt(0);
			System.out.printf("\nAno de nascimento:");
			int dataNasc = leia.nextInt();
			System.out.println("\nCPF:");
			String CPF = leia.next();
			inserirLinha(80, "■");
			Cliente Fulano = new Cliente(nomeCliente, generoCliente, dataNasc,CPF); // construtor : (String nome, char genero, int dataNasc, String cpf)
			// set altera : Fulano.setNome("Bea");
			
			
			System.out.println(boasVindas(Fulano.getGenero(), nomeCliente));
			System.out.println("\nSua idade é:"+Fulano.retornaIdade(anoAtual));
			System.out.println("\n                         CONFIRA NOSSOS PRODUTOS:");
			
			inserirLinha(80, "■");
			
			do {
				
			System.out.println("CÓDIGO \t      PRODUTO \t       ESTOQUE     R$"  );
			
			for(Produtos ProdutosLoja:ListaProdutos) {
				System.out.printf("%s \t %s \t %d \t %.2f \n",ProdutosLoja.getcodigoProduto(), ProdutosLoja.getnomeProduto(), ProdutosLoja.getestoqueProduto(), ProdutosLoja.getprecoUnidade(),"\n");
			}
			inserirLinha(80, "■");
			System.out.printf("\nInsira o código do produto para adicioná-lo ao carrinho:");
			produtoEscolhido = leia.next().toUpperCase();
			System.out.printf("\nInsira a quantidade desejada:");
			quantidadeVenda= leia.nextInt();
			
			for (Produtos ProdutosLoja:ListaProdutos) {
				if (produtoEscolhido.equals(ProdutosLoja.getcodigoProduto())) {
				
					System.out.println("\nVocê selecionou: "+ quantidadeVenda+ " unidades de: " +ProdutosLoja.getnomeProduto());
				
				if	(quantidadeVenda <= ProdutosLoja.getestoqueProduto()) {
					
					ProdutosLoja.subtraiEstoque(quantidadeVenda);
					valorCompra += quantidadeVenda*ProdutosLoja.getprecoUnidade();
					
					System.out.println("\nO valor total é R$: "+ valorCompra);
					inserirLinha(80, "■");
					
					Carrinho.add(new Produtos(ProdutosLoja.getnomeProduto(), ProdutosLoja.getprecoUnidade()));
													
				}
			}
			
		}
			
				
			
			System.out.println("Deseja continuar? [S] para Sim, [N] para Não: ");
			continuaCompra= leia.next().toUpperCase().charAt(0); 
			
			if (continuaCompra == 'N') {
				
				
				//
				
				
				notaFiscal++;
				
				/*inserirLinha(80, "■");
				System.out.printf("\n           EMISSÃO DE CUPOM FISCAL Nº: %d\n\n", notaFiscal);
				inserirLinha(80, "■");*/
				inserirLinha(80, "■");
				System.out.println("               FORMA DE PAGAMENTO");
				
				for(Produtos ListaCarrinho:Carrinho) {
								
				ListaCarrinho.Pagamento(valorCompra);

			
				}
				System.out.println("\n\nVocê acaba de adquirir um produto ꕥ CHERIN DE CAPIM ꕥ Agradecemos a preferência! ");
				
				
			}
			
		}
			
			while (continuaCompra=='S');
		
			break;
		

		case '2':
			System.out.println("WIP");
			break;

		case '3':
			System.out.println("Volte sempre!!!");
			break;}

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