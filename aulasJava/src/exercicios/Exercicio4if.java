package IntroJava;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio4 {
	
		
	public static void main (String args[]) 
	{
		//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
		//e calcule a seguinte expressão: D=(R+S)/2; R=(A+B)^2; S=(B+C)^2 */
		
		Scanner leia = new Scanner (System.in);
		
		double A,B,C,S,R,D;
		
		System.out.println("Insira um valor para A: ");	
		A= leia.nextDouble();
		
		System.out.println("Insira um valor para B: ");	
		B= leia.nextDouble();
		
		System.out.println("Insira um valor para C: ");	
		C=leia.nextDouble();
		
		if(A>=0 && B>=0 && C>=0)
		{
			
			R = (double) Math.pow((A+B), 2);
			S = (double) Math.pow((B+C), 2);
			D = (R+S)/2;
			
			
			// r=mat.potencia((a+b),2)
			// s=mat.potencia((b+c),2)
			// d=mat.arredondar(((r+s)/2), 2)


			System.out.printf("\nO valor de D é: %.2f ",D);	// só pode usar" ," e não "+" para a variavel ser impressa	
		}
		
		
		else {
			System.out.println("Insira números inteiros e positivos.");
		
		
			}
	}

}
