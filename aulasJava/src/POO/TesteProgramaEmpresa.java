package POO;

import java.util.Scanner;

public class TesteProgramaEmpresa {
	
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			String nome, telefone, endereco;
			double credito, debito;
			
			Pessoa pessoa = new Pessoa();
			Fornecedor fornecedor = new Fornecedor("Fornecedor Ciclano", "0000-0000");
			Empregado empregado = new Empregado("Empregado Fulano", "0000-0000", 1000, 0.10);
			
		//programa principal
					
			System.out.println("Dados do cliente");
			
			System.out.println("Digite o nome:");
			nome = leia.nextLine();
			pessoa.setNome(nome);
			
			System.out.println("Digite o n�mero de tel: ");
			telefone = leia.nextLine();
			
			pessoa.setTelefone(telefone);
			
			System.out.println("Digite o end dessa pessoa: ");
			endereco = leia.nextLine();
			pessoa.setEndereco(endereco);
			
			System.out.println("Dados Cliente");
			System.out.println("Nome: " + pessoa.getNome() + " Tel: " + pessoa.getTelefone() + " End: " + pessoa.getEndereco());
			
			System.out.println("Dados Fornecedor:");
			
			
			System.out.println("Digite a cr�dito desse fornecedor: ");
			credito = leia.nextDouble();
			
			System.out.println("Digite a d�vida desse fornecedor: ");
			debito = leia.nextDouble();
			
			fornecedor.setValorCredito(credito);
			fornecedor.setValorDivida(debito);
			System.out.println("Dados Fornecedor:");
			System.out.println("Nome: " + fornecedor.getNome() + "Tel:" + fornecedor.getTelefone() + " Saldo: R$" + fornecedor.obterSaldo());
			leia.close();
			
			System.out.println("\nDados Empregado:");
			
			System.out.println("Detalhes do sal�rio");	
			System.out.println("Sal�rio base de R$ 1000.00 e valor de imposto de 10%:");	
			
			System.out.println("Nome: " + empregado.getNome() + " Tel: " + empregado.getTelefone() + " Sal�rio l�quido:" + empregado.calcularSalario());

		}

}