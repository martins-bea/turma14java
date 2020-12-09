package IntroJava;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String args[]) {
	
	Scanner leia = new Scanner (System.in);
	
	double a,b,c,d,e,f,x,y;
	
	
	/*escreva("Digite o valor de A: ")
	leia (a)
	escreva("\n")*/
	
	System.out.println("Digite o valor de A:");
	a = leia.nextDouble();
	
	System.out.println("Digite o valor de B:");
	b = leia.nextDouble();
	
	
	System.out.println("Digite o valor de C:");
	c = leia.nextDouble();
	
	System.out.println("Digite o valor de D:");
	d = leia.nextDouble();
	
	System.out.println("Digite o valor de E:");
	e = leia.nextDouble();
	
	System.out.println("Digite o valor de F:");
	f = leia.nextDouble();
	
	x=((c*e)-(b*f)) / ((a*e)-(b*d));
	System.out.printf("Valor de x é: %.2f ",x);
	System.out.printf("\n");
	
	y=((a*f)-(c*d)) / ((a*e)-(b*d));
	System.out.printf("Valor de y é: %.2f ",y);
	System.out.print("\n");
			
	
	}
	
}
