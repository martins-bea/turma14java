package BancoG5;

public class Conta {

	// ATRIBUTOS
	private int numeroConta;
	protected double saldo=0;
	private String cpf;
	

	public Conta(int numeroConta) {
		super();
		this.numeroConta = numeroConta;
	}

	public Conta(int numeroConta, String cpf) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	public String getcpf() {
		return cpf;
	}

	public void setcpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// FIM SOBRECARGA

	// METODOS

	public void debito(double valorDebito) {
		if (testarSaldo(valorDebito)) {
			this.setSaldo(this.getSaldo() - valorDebito);
			
			System.out.println("SALDO TOTAL: R$ " + this.getSaldo());
		} else {
			System.out.println("SALDO INSUFICIENTE");
		}
	}

	public void credito(double valorCredito) {
		this.setSaldo(this.getSaldo() + valorCredito);
		System.out.println("SALDO TOTAL: R$ " + this.getSaldo());
	}

	public boolean testarSaldo(double valor) {

		boolean teste;
		if (valor <= this.getSaldo()) {
			teste = true;
		} else {
			teste = false;
		}

		return teste;
	}

	// FIM METODOS

}
