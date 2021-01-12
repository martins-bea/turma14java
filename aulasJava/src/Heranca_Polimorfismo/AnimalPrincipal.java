package Heranca_Polimorfismo;

public class AnimalPrincipal {

		private String nome;
		private int idade;
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public AnimalPrincipal(String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}
}
