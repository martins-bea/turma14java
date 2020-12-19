package loja;

import java.util.Scanner;

public class Cliente extends CadastroPessoa{
	
	//ATRIBUTOS AQUI
	private String cpf;
	
	//CONSTRUTOR AQUI
	public Cliente(String nome, char genero, int dataNasc, String cpf) {
		super(nome, genero, dataNasc);
		this.cpf = cpf;
	}
	
	//METODOS AQUI
	
	public String getCpf() {
		return cpf;
	}
	public String CPF() {
		
		Scanner leia = new Scanner(System.in);	
		
		System.out.println("Insira seu CPF: ");
		this.cpf = leia.nextLine();
		return this.cpf;
	}
	
	
	
}
