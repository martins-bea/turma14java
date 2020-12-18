package loja;


public class Cliente extends CadastroPessoa{
	
	//ATRIBUTOS AQUI
	private String cpf;
	
	//CONSTRUTOR AQUI
	public Cliente(String nome, char genero, int dataNasc, String cpf) {
		super(nome, genero, dataNasc);
		this.cpf = cpf;
	}
	
	//METODOS AQUI
	public void corrigeCpf() {
		
	}
}