package exercicio;

import java.util.Scanner;
import java.lang.Math;

public class listaRevisaoArrayExercicio1 {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			
			int opcao;

			double  precoDoDesconto = 0.0;
			double precoJuros =0.0;
			double precoProduto =100.0;
			System.out.println("Como voce vai querer pagar pelo seu Produto ?\n");
			System.out.println("(1) � vista em dinheiro ou cheque\n(2)� vista no cart�o de cr�dito\n(3) parcelado em duas vezes s/juros\n(4)Parcelado em tres vezes c/ juros de 10%");
			opcao= leia.nextInt();
			
			switch(opcao){

			case 1:
			System.out.println("Voce tem 20% de desconto nesse metodo de pagamento");
			precoDoDesconto = (precoProduto*20)/100;
			System.out.println("\no valor do desconto e de "+precoDoDesconto+" reais");
			
			double precoFinal =precoProduto-precoDoDesconto;
			
			System.out.println("\nVoce ira para "+precoFinal+" reais pelo produto");
			
			System.out.println("");
			break;
			case 2:
			System.out.println("Voce tem 15% de desconto nesse metodo de pagamento");
			precoDoDesconto = (precoProduto*15)/100;
			System.out.println("\no valor do desconto e de "+precoDoDesconto);
			precoFinal =precoProduto-precoDoDesconto;
			System.out.println("\nVoce ira para "+precoFinal+" reais pelo produto");
			break;
			case 3:
			System.out.println("Voce nao tem desconto nesse metodo de pagamento");
			precoProduto = precoProduto/2;
			System.out.println("\nVoce ira para 2 vezes de "+precoProduto+" reais pelo produto");	
			break;
			case 4:
			System.out.println("Voce tem 10% de juros nesse metodo de pagamento");
			precoJuros = (precoProduto*110)/100;
			precoJuros =precoJuros-precoProduto;
			System.out.println("\no valor do juros  e de "+precoJuros);
			precoFinal =precoProduto+precoJuros;
			precoFinal=precoFinal/3;
				Object math;
				System.out.println("\nVoce ira para pagar em 3 vezes de "+(Math.pow(precoFinal, 2)+" reais pelo produt"));
			break;
				
			}
		}


	}


