package POO;

public class Vendedor extends Pessoa {

 /*Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorVendas
(correspondente ao valor monet�rio dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que ser� adicionado ao vencimento base do Vendedor).*/
	
	
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


