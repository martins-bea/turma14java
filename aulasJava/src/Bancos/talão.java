package Bancos;
import java.util.Scanner;

public class tal�o {

	static Scanner leia = new Scanner(System.in);

	double emprestado = 0.0;
	double emprestimo = 10000.0;
	double saldo = 0.0;
	double credito = 1000.0;
	double debito = 0.0;
	char voltar = 'V';
	int numeroConta = 1;
	String nomeUsuario;
	int numeroUsuario = 0;
	int cpf = 111;
	int cpfUser = 0;
	double saldoatual = 0.0;
	double dinheiro = 0.0;
	int x = 0;
	int dia = 5;
	double retirada;
	double armazenadorDoSaldo;
	
	int diaMaximo;
	int diaAtual;
	double Creditouniversidade = 400.0;
	double saldoUniversitario = 0.0;
	double saldoAtualUni = 0.0;
		
	int limiteTalao[] = new int[3];
	int acumuladorTalao [] = new int [0];
	

	char tipo;

	if(saldo<=0)
	{
		System.out.println("Opera��o n�o realizada.");
		System.out.println("\n Aperte V para retornar \n");
		char voltar = leia.next().toUpperCase().charAt(0);
		if (tipo == 'V') {

			//menu();
		}
	}

	else
	{
		for (int x = 0; x < 40; x++) {
			System.out.println("\n Impress�o de Tal�o de Cheque (S) para Sim, (N) para N�o");
			char tipo = leia.next().toUpperCase().charAt(0);
			if (tipo == 'S') {
				
			}
			int acumuladorTalao = x++;
				
				System.out.println(" \n Tal�o de cheque impresso com sucesso!");
				System.out.println(" \n O saldo atual � de:" + saldo);
				System.out.println(" \n Total de tal�o impresso no m�s:" + acumuladorTalao);
			}
		}
	}
