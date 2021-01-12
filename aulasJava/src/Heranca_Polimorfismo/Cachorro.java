package Heranca_Polimorfismo;

public class Cachorro extends AnimalPrincipal {
	
	public Cachorro(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public String correr()
	{
		return "Cachorro correndo";
	}
	
	public String emitirSom()
	{
		return "grrr, Auu auu!";
	}
	
}
