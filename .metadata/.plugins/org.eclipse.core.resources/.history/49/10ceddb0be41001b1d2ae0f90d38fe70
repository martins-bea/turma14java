package loja;

import java.util.Scanner;

public class Produtos {

	// ATRIBUTOS

	private String nomeProduto;
	private String codigoProduto;
	private double precoUnidade;
	private int estoqueProduto;
	private int quantidadeVenda;
	
	// CONSTRUTORES AQUI 

	public Produtos(String codigoProduto, String nomeProduto, double precoUnidade, int estoqueProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnidade = precoUnidade;
		this.estoqueProduto = estoqueProduto;
	}

	public Produtos(String nomeProduto, double precoUnitario) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoUnidade = precoUnitario;
	}

	// ENCAPSULAMENTO AQUI 

	public String getnomeProduto() {
		return nomeProduto;
	}

	public void setnomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getcodigoProduto() {
		return codigoProduto;
	}

	public void setcodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getprecoUnidade() {
		return precoUnidade;
	}

	public void setprecoUnidade(double precoUnidade) {
		this.precoUnidade = precoUnidade;
	}

	public int getestoqueProduto() {
		return estoqueProduto;
	}

	public void setestoqueProduto(int estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}

	public int getquantidadeVenda() {
		return quantidadeVenda;
	}

	public void setquantidadeVenda(int quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}

	// METODOS - PROCESSOS

	public boolean Vendas(int quantidadeVenda) {
		if (quantidadeVenda > this.estoqueProduto || quantidadeVenda <= 0) {
			return false;
		} else {
			return true;
		}

	}
	
	public void Pagamento (double totalCompra) {
		
		int opcaoPagamento, quantidadeParcelas;
		double imposto, desconto, juros, valorParcela, valorFinal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("\n 1 - PAGAMENTO A VISTA 10% \n 2 - DEBITO \n 3 - CRÉDITO \n 4 - CREDITO [ATÉ 3x] COM JUROS DE 10% ");
		opcaoPagamento = leia.nextInt();
		
		if (opcaoPagamento == 1 ) {
			
			
			desconto=totalCompra*0.1;
			imposto= (totalCompra-desconto)*0.09;
			valorFinal=totalCompra-desconto+imposto;
			
		System.out.printf("Desconto dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f", desconto, imposto,valorFinal);	
			
					
		}
		
		else if (opcaoPagamento == 2 ) {
			
			
			
			imposto= totalCompra*0.09;
			valorFinal=totalCompra+imposto;
			

			System.out.printf("Impostos dessa compra: %.2f\nValor Total: %.2f", imposto,valorFinal);
			
			
		}
		else if (opcaoPagamento == 3 ) {
			
			
			juros=totalCompra*0.05;
			imposto= (totalCompra+juros)*0.09;
			valorFinal=totalCompra+juros+imposto;
			
			System.out.printf("Juros dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f", juros, imposto,valorFinal);
			
			
		}
			
		else if (opcaoPagamento == 4 ) {
				
				System.out.println("Quantas parcelas gostaria de efetuar o pagamento?");
				quantidadeParcelas = leia.nextInt();
				
				if(quantidadeParcelas==2) {
				
				juros=totalCompra*0.10;
				imposto= (totalCompra+juros)*0.09;
				valorFinal=totalCompra+juros+imposto;
				valorParcela= valorFinal/quantidadeParcelas;
				
				System.out.printf("Juros dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f em 2 parcelas de: %.2f", juros, imposto,valorFinal,valorParcela);
			
				}
				
				else if(quantidadeParcelas==3) {
					
					juros=totalCompra*0.10;
					imposto= (totalCompra+juros)*0.09;
					valorFinal=totalCompra+juros+imposto;
					valorParcela= valorFinal/quantidadeParcelas;
					
					System.out.printf("Juros dessa compra: %.2f\nImpostos dessa compra: %.2f\nValor Total: %.2f em 3 parcelas de: ", juros, imposto,valorFinal, valorParcela);
							
				}
				else {
					System.out.println("Transação indisponivel");
				}
			}
		
		}

	public void subtraiEstoque(int quantidadeVenda) {
		this.estoqueProduto = this.estoqueProduto - quantidadeVenda;
	}

	public void somarEstoque(int itemSoma) {
		this.estoqueProduto = this.estoqueProduto + itemSoma;
	}

}