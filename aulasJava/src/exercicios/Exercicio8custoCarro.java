package IntroJava;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String Args[]) {
		Scanner leia = new Scanner (System.in);
		
		double custoFabrica, custoConsumidor, custoDistribuidor, imposto;
		
		System.out.println("Custo de fábrica do carro: ");
		
		custoFabrica= leia.nextDouble();
		
		custoDistribuidor= custoFabrica * 0.28 ;
		imposto= custoFabrica * 0.45;
		
		custoConsumidor = custoFabrica + imposto + custoDistribuidor;
		
		System.out.printf("O custo do carro para o consumidor é R$: %.2f", custoConsumidor );
		
		/* 
		

		escreva("O custo do carro para o consumidor é de R$", Matematica.arredondar(custoConsumidor,2))*/

	}

}
