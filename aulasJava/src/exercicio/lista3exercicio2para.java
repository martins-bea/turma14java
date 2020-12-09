package exercicio;

import java.util.Scanner;

public class lista3exercicio2para  {
	


	public static void main(String[] args) {
		int numero;
		int soma = 0;

		for (numero = 1; numero <= 500; numero++) {
			if ((numero % 2 == 1) && (numero % 3 == 0)) {
				soma = soma + numero;
			}
		}

		System.out.println(soma);
	}

}