package IntroJava;
import java.util.Scanner;

public class idade {
	
	
	
	static int idadePessoa (int anoNascimento) {
		
		int idade;	
		
		idade = 2020- anoNascimento;
		
		return idade;
		
	}
	
	public static void main (String Args[]) {
		
						
		Scanner leia = new Scanner (System.in);
		System.out.println("insira o ano de nascimento: ");
		int anoNascimento= leia.nextInt();
		
		 System.out.println(idadePessoa(anoNascimento) + " anos");
		
	}
}
}
