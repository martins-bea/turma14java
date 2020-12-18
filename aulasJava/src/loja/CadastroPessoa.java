package loja;

public abstract class CadastroPessoa {

	//ATRIBUTOS
	private String nome;
	private char genero;
	private int dataNasc;
	
	//CONSTRUTOR
	public CadastroPessoa(String nome, char genero, int dataNasc) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.dataNasc = dataNasc;
	}
	
	//METODO AQUI
	public void voltaIdade() {
		
	}
	
	
}