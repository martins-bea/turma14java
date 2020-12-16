package POO;

public class Vendedor extends Pessoa {

 /*Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que será adicionado ao vencimento base do Vendedor).*/
	
	
	private double valorVendas;

	public Vendedor() {

	}

	public double getvalorVendas() {
		return valorVendas;
	}

	public void setvalorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
}


