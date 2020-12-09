package exercicio;

import java.util.Scanner;

public class lista3exercicio2facaEnquanto {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int somatorio, numero;
        somatorio=0;

        System.out.println("Insira um nº ");
        numero = scan.nextInt();

        do{
            somatorio = somatorio + numero; //acumulador
            numero--;
        }
        while(numero != 0);

        System.out.println("O somatório é ");
        System.out.println(somatorio);

    }

}