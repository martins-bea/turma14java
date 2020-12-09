
import java.util.Scanner;

public class exercicio4laco {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int num=0;
		
		
		System.out.println("Digite um nº inteiro: ");
		num= leia.nextInt();
		
		if (num ==0){
			
			System.out.print("Você digitou zero, digite outro número.");
			
		}
		else if (num <  0){
			System.out.print("O nº é negativo")};
			
		else if ((num%2) ==0 {
			System.out.print("O nº é par")};
			}
			else {System.out.print("O nº é impar")};
		
		
	
		}
	

}
