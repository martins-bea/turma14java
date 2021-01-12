package Heranca_Polimorfismo;

public class Preguica extends AnimalPrincipal{
				
		public Preguica(String nome, int idade)
		{
			super(nome,idade);
		}
		
		public String subirArvore()
		{
			return "Preguiça subindo a árvore";
		}
		
		public String emitirSom()
		{
			return "zZzZzZ";
		}

}
