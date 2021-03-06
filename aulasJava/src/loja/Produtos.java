package loja;

import java.util.Scanner;

public class Produtos {

	// ATRIBUTOS

	private String nomeProduto;
	private String codigoProduto;
	private double precoUnidade;
	private int estoqueProduto;
	private int quantidadeVenda;
	private double valorTotalProduto;
	
	
	// CONSTRUTORES AQUI 

	public Produtos(String codigoProduto, String nomeProduto, double precoUnidade, int estoqueProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.precoUnidade = precoUnidade;
		this.estoqueProduto = estoqueProduto;
		
	}

	public Produtos(String nomeProduto, int quantidadeVenda, double precoUnitario, double valorTotalProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidadeVenda= quantidadeVenda;
		this.precoUnidade = precoUnitario;
		this.valorTotalProduto = valorTotalProduto;
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
	
	
	public double getValorTotalProduto() {
		return valorTotalProduto;
	}

	public void setValorTotalProduto(double valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
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

	// METODOS - PROCESSOS AQUI � O METODO ONDE RETIRA DO ESTOQUE ENQUANTO SE COMPRA
	
	
	public void subtraiEstoque(int quantidadeVenda) {
		this.estoqueProduto = this.estoqueProduto - quantidadeVenda;
	}
	
	public void adicionarEstoque(int quantidadeAdicionar) {
		this.estoqueProduto = this.estoqueProduto + quantidadeAdicionar;
	}

}