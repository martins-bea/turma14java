package loja;

public abstract class CadastroPessoa {

	// ATRIBUTOS
	private String nome;
	private int dataNasc;
	private char genero;

	// CONSTRUTOR
	public CadastroPessoa(String nome, char genero, int dataNasc) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.genero = genero;

	}

	// METODO AQUI

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return dataNasc;
	}

	public void setAnoNascimento(int dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int retornaIdade(int anoAtual) {
		return (anoAtual - this.dataNasc);
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

}