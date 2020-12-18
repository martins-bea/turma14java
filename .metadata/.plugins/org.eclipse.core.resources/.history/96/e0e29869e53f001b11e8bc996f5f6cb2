import java.util.Scanner;


public class TalaoCheque {
	
	int talao[] = new int[40];
	int totalTalao[] = new int[40];
	int qntdTalao = 0;
	char opcaoTalao;
	int tipo;
	public static void talao() {

		
		
		
		void impressaoTalao () {
		
		int talao[] = new int[40];
		int totalTalao[] = new int[40];
		int numConta[] = new int[40];
		int numeroConta = 0;
		
		System.out.println("IMPRESSÃO DE TALÃO: S para Sim ou N para Não: ");
		opcaoTalao = leia.next().toUpperCase().charAt(0);
		while (opcaoTalao != 'S' && opcaoTalao != 'N') {
			System.out.println("\nTransação inválida! Tente novamente. ");
			opcaoTalao = leia.next().toUpperCase().charAt(0);
		}
		System.out.println("insira a quantidade de talões desejada: ");
		qntdTalao = leia.nextInt();
		while (qntdTalao > 3 || qntdTalao < 0) {
			System.out.printf(
					"Quantidade de talões inválida. Você possui  %d talões disponíveis no momento. Insira a quantidade desejada: ",
					talao[numeroConta]);
			qntdTalao = leia.nextInt();
		}
		while (qntdTalao > talao[numeroConta]) {
			System.out.printf("ATENÇÃO: Você possui %d talões disponíveis no momento. Insira a quantidade desejada:",
					talao[numeroConta]);
			qntdTalao = leia.nextInt();
		}

		talao[numeroConta] = talao[numeroConta] - qntdTalao;
		totalTalao[numeroConta] = totalTalao[numeroConta] + qntdTalao;

		if (talao[numeroConta] == 0) {
			talao[numeroConta] = 3;
		}

		System.out.printf("A quantidade impressa de talão hoje é de: %d\n", qntdTalao);
		System.out.printf("A quantidade impressa total: %d\n", totalTalao[numeroConta]);
		System.out.printf("Obrigado por usar nosso banco");

	}
}
}
