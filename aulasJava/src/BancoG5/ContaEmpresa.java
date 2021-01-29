package BancoG5;

public class ContaEmpresa extends Conta{

private double emprestimoEmpresa;
	

	public ContaEmpresa(int numeroConta,double emprestimoEmpresa)
	{
		super(numeroConta);
		this.emprestimoEmpresa=emprestimoEmpresa;
	}
	
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public void emprestimoSolicitado(double valorEmprestimo)
	{
		if(valorEmprestimo <= this.emprestimoEmpresa)
		{
			this.emprestimoEmpresa=this.emprestimoEmpresa-valorEmprestimo;
			this.saldo = this.saldo + valorEmprestimo;
			
			System.out.println("Valor dispon�vel para NOVO emprestimo: " + this.emprestimoEmpresa);
			System.out.println("Saldo ATUAL: "+this.saldo);
		}
		else 
		{
			System.out.println("Valor ind�spon�vel. Verifique com seu gerente");
		}
		
	}
	
}