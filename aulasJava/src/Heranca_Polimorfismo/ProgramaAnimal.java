package Heranca_Polimorfismo;

public class ProgramaAnimal {

	public static void main(String[] args) {
		
		
		Cachorro cachorro = new Cachorro("Amora", 1);
		Cavalo cavalo = new Cavalo ("Bala-no-alvo", 1 );
		Preguica preguica = new Preguica ("Lent�cia", 2);
		
		System.out.println("Nome do Cachorro: " + cachorro.getNome() + " \nFaz o  barulho: " + cachorro.emitirSom());
		System.out.println("\nNome do Cavalo: " + cavalo.getNome() + " \nFaz o barulho: " + cavalo.emitirSom());
		System.out.println("\nNome da Pregui�a: " + preguica.getNome() + " \nFaz o barulho: " + preguica.emitirSom());

	}

}
