package POO;


public class Pessoa {

	private String nome; 
	private String end;
	private String tel;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.tel = telefone;
	}

	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.end = endereco;
		this.tel = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return end;
	}

	public void setEndereco(String endereco) {
		this.end = endereco;
	}

	public String getTelefone() {
		return tel;
	}

	public void setTelefone(String telefone) {
		this.tel = telefone;
	}
	

	
}


