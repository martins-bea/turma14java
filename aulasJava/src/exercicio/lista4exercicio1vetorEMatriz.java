package exercicio;

import java.util.Scanner;
/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma ativi
/dade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */

public class lista4exercicio1vetorEMatriz {


	public static void main(String[] args) {	
		Scanner leia = new Scanner(System.in);

		int valores[] = new int[5];
		int maiorNum = 0;
		

		for (int i=0; i<5; i++) {;
			System.out.printf("Digite o "+(i+1)+"� valor: ");
			valores [i]= leia.nextInt();
			}
	


		for(int i=0; i<5; i++){
			if(valores[i] > maiorNum){
				maiorNum = valores[i];
			}
		}
		System.out.println("\n");
		System.out.printf("\n O maior n�mero � de:"+maiorNum);

	}
}



