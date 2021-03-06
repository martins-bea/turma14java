package loja;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadLoja {

	public static void main(String[] args)

	{
		Scanner leia = new Scanner(System.in);
		List<Produtos> ListaProdutos = new ArrayList<>();
		List<Produtos> Carrinho = new ArrayList<>();

		// Variaveis

		int quantidadeVenda = 0, notaFiscal = 20200, opcaoPagamento = 0, quantidadeAlterar = 0;
		String produtoEscolhido, produtoAlterar;
		int anoAtual = 2020;
		double valorCompra = 0, valorTotalProduto = 0;
		char continuaCompra = 0, sair = 0, continuaAlterar = 0;

		// ARRAYLIST AQUI ListaProdutos.add(new Produto("Ar-01", "Capim-Limão", 10.00,
		// 10))

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
		System.out.println("\n                            ꕥ CHEIRIN DE CAPIM ꕥ \n");
		inserirLinha(80, "■");
		System.out.println();

		System.out.println("                          [1] ▶ COMPRAR PRODUTOS                ");
		System.out.println("                          [2] ▶ GERENCIAR ESTOQUE                ");
		System.out.println("                          [3] ▶ SAIR                             ");

		System.out.print(" \n");
		System.out.print("\n                            DIGITE A OPÇÃO:\n\n");

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
			Cliente Fulano = new Cliente(nomeCliente, generoCliente, dataNasc, CPF); // construtor : (String nome, char
			// genero, int dataNasc, String
			// cpf)
			// set altera : Fulano.setNome("Bea");

			System.out.println(boasVindas(Fulano.getGenero(), nomeCliente));
			System.out.println("\nSua idade é:" + Fulano.retornaIdade(anoAtual));
			System.out.println("\n                         CONFIRA NOSSOS PRODUTOS:");
			inserirLinha(80, "■");

			do {

				System.out.println("CÓDIGO \t      PRODUTO \t       ESTOQUE     R$");

				for (Produtos ProdutosLoja : ListaProdutos) {
					System.out.printf("%s \t %s \t %d \t %.2f \n", ProdutosLoja.getcodigoProduto(),
							ProdutosLoja.getnomeProduto(), ProdutosLoja.getestoqueProduto(),
							ProdutosLoja.getprecoUnidade(), "\n");
				}
				inserirLinha(80, "■");
				System.out.printf("\nInsira o código do produto para adicioná-lo ao carrinho:");
				produtoEscolhido = leia.next().toUpperCase();
				System.out.printf("\nInsira a quantidade desejada:");
				quantidadeVenda = leia.nextInt();

				for (Produtos ProdutosLoja : ListaProdutos) {
					if (produtoEscolhido.equals(ProdutosLoja.getcodigoProduto())) {

						System.out.println("\nVocê selecionou: " + quantidadeVenda + " unidades de: "
								+ ProdutosLoja.getnomeProduto());

						if (quantidadeVenda <= ProdutosLoja.getestoqueProduto()) {

							ProdutosLoja.subtraiEstoque(quantidadeVenda);

							valorCompra += quantidadeVenda * ProdutosLoja.getprecoUnidade();

							ProdutosLoja.setValorTotalProduto(ProdutosLoja.getprecoUnidade() * quantidadeVenda);

							System.out.println("\nO valor total é R$: " + valorCompra);
							inserirLinha(80, "■");

							Carrinho.add(new Produtos(ProdutosLoja.getnomeProduto(), quantidadeVenda,
									ProdutosLoja.getprecoUnidade(), ProdutosLoja.getValorTotalProduto()));

						}

						else if (quantidadeVenda < 0 || quantidadeVenda > ProdutosLoja.getestoqueProduto()) {
							System.out.println(" Quantidade inválida ");
						}

					}

				}

				System.out.println("Deseja continuar? [S] para Sim, [N] para Não: ");
				continuaCompra = leia.next().toUpperCase().charAt(0);

				if (continuaCompra == 'N') {

					// notaFiscal++;

					inserirLinha(80, "■");
					System.out.println("               FORMA DE PAGAMENTO");
					System.out.println(
							"\n 1 - PAGAMENTO A VISTA 10% DE DESCONTO \n 2 - DEBITO \n 3 - CRÉDITO \n 4 - CREDITO [ATÉ 3x] COM JUROS DE 10% ");
					opcaoPagamento = leia.nextInt();

					Pagamento2(valorCompra, opcaoPagamento, valorTotalProduto, Carrinho, quantidadeVenda);

					System.out.println(
							"\n\nVocê acaba de adquirir um produto ꕥ CHERIN DE CAPIM ꕥ Agradecemos a preferência! ");

				}

			}

			while (continuaCompra == 'S');

			break;

		case '2':

			do {

				System.out.println("      GERENCIAMENTO DE ESTOQUE\n");

				System.out.println("CÓDIGO \t      PRODUTO \t       ESTOQUE    ");

				for (Produtos ProdutosLoja : ListaProdutos) {
					System.out.printf("%s \t %s \t %d \t \n", ProdutosLoja.getcodigoProduto(),
							ProdutosLoja.getnomeProduto(), ProdutosLoja.getestoqueProduto());

				}

				inserirLinha(80, "■");
				System.out.printf("\nInsira o código do produto para alterá-lo:");
				produtoAlterar = leia.next().toUpperCase();

				for (Produtos ProdutosLoja : ListaProdutos) {

					if (ProdutosLoja.getcodigoProduto().equals(produtoAlterar)) {

						System.out.printf("\nVocê deseja Adicionar (A) ou subtrair(S) estoque do produto?");
						continuaAlterar = leia.next().toUpperCase().charAt(0);

						if (continuaAlterar == 'A') {

							inserirLinha(80, "■");
							System.out.println(
									"Insira a quantidade a adicionar no estoque do produto: " + produtoAlterar);
							quantidadeAlterar = leia.nextInt();

							ProdutosLoja.adicionarEstoque(quantidadeAlterar);

							System.out.println("Quantidade total do estoque: " + ProdutosLoja.getestoqueProduto());

						}

						if (continuaAlterar == 'S') {

							inserirLinha(80, "■");
							System.out
									.println("Insira a quantidade a subtrair no estoque do produto: " + produtoAlterar);
							quantidadeAlterar = leia.nextInt();

							if (quantidadeAlterar <= ProdutosLoja.getestoqueProduto()) {

								ProdutosLoja.subtraiEstoque(quantidadeAlterar);

								System.out.println("Quantidade total do estoque: " + ProdutosLoja.getestoqueProduto());

							}

							else if (quantidadeAlterar < 0 || quantidadeAlterar > ProdutosLoja.getestoqueProduto()) {
								System.out.println(" Quantidade inválida ");
							}
						}
					}

				}

				System.out.println("Deseja continuar? [S] para Sim, [N] para Não: ");
				sair = leia.next().toUpperCase().charAt(0);

			}

			while (sair == 'S');

			System.out.println("Você atulizou o estoque.");

			break;

		case '3':
			System.out.println("Volte sempre!!!");
			break;
		}

	}

	public static void Pagamento2(double totalCompra, int opcaoPagamento, double valorTotalProduto,
			List<Produtos> Carrinho, int quantidadeVenda) {

		int quantidadeParcelas;
		double imposto, desconto, juros, valorParcela, valorFinal;

		Scanner leia = new Scanner(System.in);

		if (opcaoPagamento == 1) {

			desconto = totalCompra * 0.1;
			imposto = (totalCompra - desconto) * 0.09;
			valorFinal = totalCompra - desconto + imposto;

			notaFiscal(Carrinho);
			System.out.printf("Desconto dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f", desconto,
					imposto, valorFinal); // nota fiscal

		}

		else if (opcaoPagamento == 2) {

			imposto = totalCompra * 0.09;
			valorFinal = totalCompra + imposto;

			notaFiscal(Carrinho);

			System.out.printf("Impostos dessa compra: %.2f\nValor Total: %.2f", imposto, valorFinal);

		} else if (opcaoPagamento == 3) {

			juros = totalCompra * 0.05;
			imposto = (totalCompra + juros) * 0.09;
			valorFinal = totalCompra + juros + imposto;

			notaFiscal(Carrinho);

			System.out.printf("Juros dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f", juros,
					imposto, valorFinal);

		}

		else if (opcaoPagamento == 4) {

			System.out.println("Quantas parcelas gostaria de efetuar o pagamento?");
			quantidadeParcelas = leia.nextInt();

			if (quantidadeParcelas == 2) {

				juros = totalCompra * 0.10;
				imposto = (totalCompra + juros) * 0.09;
				valorFinal = totalCompra + juros + imposto;
				valorParcela = valorFinal / quantidadeParcelas;
				notaFiscal(Carrinho);

				System.out.printf(
						"Juros dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f em 2 parcelas de: %.2f",
						juros, imposto, valorFinal, valorParcela);

			}

			else if (quantidadeParcelas == 3) {

				juros = totalCompra * 0.10;
				imposto = (totalCompra + juros) * 0.09;
				valorFinal = totalCompra + juros + imposto;
				valorParcela = valorFinal / quantidadeParcelas;
				notaFiscal(Carrinho);

				System.out.printf(
						"Juros dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f em 3 parcelas de: %.2f",
						juros, imposto, valorFinal, valorParcela);

			}

		} else {
			System.out.println("Transação indisponivel");
		}

	}

	public static void notaFiscal(List<Produtos> Carrinho) {

		inserirLinha(80, "■");
		System.out.println("                        NOTA FISCAL ");
		inserirLinha(80, "■");
		System.out.println("Produto\t          Quantidade\t Preço UN\tValor Total");

		for (Produtos ProdutosLoja : Carrinho) {

			System.out.printf("%s \t %d \t %.2f \t\t %.2f \n", ProdutosLoja.getnomeProduto(),
					ProdutosLoja.getquantidadeVenda(), ProdutosLoja.getprecoUnidade(),
					ProdutosLoja.getValorTotalProduto());

		}

		inserirLinha(80, "■");
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