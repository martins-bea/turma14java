

import java.util.Scanner;

public class exercicio1laço {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		double p=0.0, e=0.0, m = 4.00, multaTotal;
		final int LIMITEPESO=50;
			
		System.out.print("Insira o peso: ");
		p= leia.nextDouble();
		
		
		if (p<= LIMITEPESO) {
			
			System.out.print("Não há excesso de peso.");
		}else {
			
			e=p-LIMITEPESO;
			multaTotal=(e*m);
			
			System.out.print("A multa por excesso de peso é de "+ multaTotal);
		}
		
			

		}
			
	}
