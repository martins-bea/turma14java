import java.util.Scanner;

public class bancoContaCorrente {

	public static void main(String[] args) {

		double movimentoConta;
		char status, continuar;
		int i = 0;
		char opcaoTalao;
		int qntdTalao;
		double saldo[];
		int movimentacao[];
		int totalTalao[];
		int conta;
		int tipo;
		int talao[]= {1,2,3};
		
		Scanner leia = new Scanner(System.in);

		System.out.println("1 ▶ SALDO \n2 ▶ SAQUE\n3 ▶ DEPÓSITO \n 4 ▶ TALÃO \n5 ▶ VOLTAR \n6 ▶ SAIR");
		tipo = leia.nextInt();

		switch (tipo) {
		case 1:
		case 2:
		case 3:
		case 4:// talão

			System.out.println("IMPRESSÃO DE TALÃO: S para Sim ou N para Não: ");
			opcaoTalao = leia.next().toUpperCase().charAt(0);
			while (opcaoTalao != 'S' && opcaoTalao != 'N') {
				System.out.println("\nTransação inválida! Tente novamente. ");
				opcaoTalao = leia.next().toUpperCase().charAt(0);
			}
			System.out.println("insira a quantidade de talões desejada: ");
			qntdTalao = leia.nextInt();
			while (qntdTalao > 3) {
				System.out.println("Quantidade de talões acima do disponível:");
				qntdTalao = leia.nextInt();
			}
			while (qntdTalao > talao[]) {
				System.out.printf("ATENÇÃO: Você possui  %d talões disponíveis no momento. Insira a quantidade desejada:",
				talao[conta]);
				qntdTalao = leia.nextInt();
			}

			talao[conta] = talao[conta] - qntdTalao;
			totalTalao[conta] = totalTalao[conta] + qntdTalao;

			if (talao[conta] == 0) {
				talao[conta] = 3;
			}

			System.out.printf("A quantidade impressa de talão hoje é de:: %d\n", qntdTalao);
			System.out.printf("Obrigado por usar nosso banco");

			// return;

		case 5: // voltar();
			break;
		case 6: // sair();
			break;
		}
	}
}
