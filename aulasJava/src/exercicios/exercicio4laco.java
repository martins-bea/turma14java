
import java.util.Scanner;

public class exercicio4laco {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int num=0;
		
		
		System.out.println("Digite um n� inteiro: ");
		num= leia.nextInt();
		
		if (num ==0){
			
			System.out.print("Voc� digitou zero, digite outro n�mero.");
			
		}
		else if (num <  0){
			System.out.print("O n� � negativo")};
			
		else if ((num%2) ==0 {
			System.out.print("O n� � par")};
			}
			else {System.out.print("O n� � impar")};
		
		
	
		}
	

}
