package exercicio;

import java.util.Random;
import java.util.Scanner;


public class lista4exercicio3Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random sorteio = new Random();

		//variaveis - vetores e matrizes

		final int LINHA=4, COLUNA=6;
		int N1[][]= new int [4][6],N2[][]= new int [4][6] ; 
		int M1[][]= new int [4][6],M2[][]= new int [4][6];




		System.out.println("Matriz N1\n");

		for (int linha=0;linha<LINHA;linha++)

		{
			for  (int coluna=0; coluna<COLUNA; coluna++) //laço vassoura molejão
			{
				//magica processamentos

				N1[linha][coluna]=sorteio.nextInt(9);
				System.out.print(N1[linha][coluna]+" ");

			}
			
			System.out.printf("\n","\t");
		}
		System.out.println("\n");
		System.out.println("Matriz N2\n");
		
		for (int linha=0;linha<LINHA;linha++) {// laço
		
			for  (int coluna=0; coluna<COLUNA; coluna++) //laço
			{
				//magica processamentos
				N2[linha][coluna]=sorteio.nextInt(9);
						System.out.print(N2[linha][coluna]+" ");

			}
			System.out.printf("\n", "\t");
		}
		System.out.println("\n");
		System.out.println("Matrix M1 (Soma N1 + N2)\n");
		for (int linha=0;linha<LINHA; linha++) // laço 
		{
			for (int coluna=0; coluna<COLUNA; coluna++) //laço
			{
				//magica

				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
						System.out.print(M1[linha][coluna]+" ");

			}
			System.out.printf("\n", "\t");
		}
		System.out.println("\n");
		System.out.println("Matriz M2 (Diferença entre N1 e N2)\n");
		for (int linha=0;linha<LINHA; linha++)
		{
			for (int coluna=0; coluna<COLUNA; coluna++)
			{
				//magica

				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
						System.out.print(M2[linha][coluna]+" ");

			}
			System.out.printf("\n", "\t");
		}



	}
}
