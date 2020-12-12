import java.util.Scanner;

public class bancoG5 {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//BEATRIZ -VETOR DE CONTA - INT  [1-40] - 40 POSIÇÕES
		
		int conta[] = new int[40];
		
		for (int x = 0; x < 40; x++) {
			conta[x]= (x+1);
			
			System.out.println(conta[x]);
			
		}
	
	}


}