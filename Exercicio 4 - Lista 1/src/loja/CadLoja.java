package loja;
import java.util.Scanner;
public class CadLoja {
	
		    public static void main(String[] args)

	    {

	        Scanner leia = new Scanner(System.in);


	        linhaDetalhe();
	        System.out.println("            Cherin de Capim");
	        linhaDetalhe();
	        System.out.println();

	        System.out.println("[1] COMPRAR PRODUTOS");
	        System.out.println("[2] GERENCIAR ESTOQUE");
	        System.out.println("[3] SAIR");
	        System.out.println();
	        System.out.print("DIGITE A OPÇÃO: ");
	        char opcaoMenu = leia.next().charAt(0); // 
	        switch (opcaoMenu)
	        {

	            case '1':
	            {
	                leia.nextLine();
	                System.out.print("Por favor informe o seu nome: ");
	                String nomeCliente = leia.nextLine();
	                System.out.print("Você se define como M-masculino, F-feminino ou O-outro :");
	                char generoCliente = leia.next().toUpperCase().charAt(0);
	                boasVindas(generoCliente);


	                break;

	            }
	            case '2':
	            {
	                System.out.println("WIP");
	                break;
	            }
	            case '3':
	            {
	                System.out.println("Volte sempre!!!");
	                break;
	            }

	        }


	    }

	    public static String boasVindas(char generoCliente) {

	        //se sexo == F 
	        String saudacao;

	        if (generoCliente== 'M' ){
	            saudacao = "Seja bem-vindo!";
	        }
	        else if(generoCliente == 'F' ) {
	            saudacao = "Seja bem-vinda!";
	        }
	        else if(generoCliente == 'O' ){
	            saudacao = "Seja bem-vinde!";
	        }
	        else {
	            saudacao = "Erro";
	        }
	        return saudacao;
	    }


	    public static void linhaDetalhe() {
	        System.out.println("❀⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯⋯❀");

	    }



	    }