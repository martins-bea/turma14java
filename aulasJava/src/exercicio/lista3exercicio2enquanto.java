package exercicio;

import java.util.Scanner;


public class lista3exercicio2enquanto {

			    public static void main(String[] args) {
			       Scanner scan = new Scanner(System.in);

			        int numero;

			        System.out.println("Insira o nº");
			        numero = scan.nextInt();

			        while(numero <= 300){

			            System.out.println(numero);
			            numero=numero*3;
			        }

	  }

}
