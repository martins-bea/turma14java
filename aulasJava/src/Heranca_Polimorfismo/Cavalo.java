package Heranca_Polimorfismo;

public class Cavalo extends AnimalPrincipal {

	
	public Cavalo(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public String correr()
	{
		return "Cavalo correndo";
	}
	
	public String emitirSom()
	{
		return "Rii, riiinr";
	}
	
}
