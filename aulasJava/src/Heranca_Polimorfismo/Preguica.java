package Heranca_Polimorfismo;

public class Preguica extends AnimalPrincipal{
				
		public Preguica(String nome, int idade)
		{
			super(nome,idade);
		}
		
		public String subirArvore()
		{
			return "Pregui�a subindo a �rvore";
		}
		
		public String emitirSom()
		{
			return "zZzZzZ";
		}

}
