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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return  dataNasc;
	}

	public void setAnoNascimento(int dataNasc) {
		this.dataNasc =  dataNasc;
	}
	
	public int retornaIdade(int anoAtual) {
		return (anoAtual - this.dataNasc);
	}
}