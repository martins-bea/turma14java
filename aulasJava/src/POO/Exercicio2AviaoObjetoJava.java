package POO;

public class Exercicio2AviaoObjetoJava {


		public String Aviao;
		public double velocidadeMinima;
		public double velocidadeMaxima;
		public boolean EstadoAviao;
		
		public Exercicio2AviaoObjetoJava()
		{
			
		}
		public Exercicio2AviaoObjetoJava(double velocidadeMinima, double velocidadeMaxima)
		{
			this.velocidadeMinima = velocidadeMinima;
			this.velocidadeMaxima = velocidadeMaxima;
		}
		
		public void EstadoAviao(char aviao)
		{
			if(EstadoAviao == true)
			{
				System.out.println("Avi�o Ligado");
			}else {
				System.out.println("Avi�o Desligado");
			}
			
		}
		
}



