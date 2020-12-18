package POO;

public class Funcionario {
	
	private String nome;
	protected int horasMensais;
	protected double valorHora;
	
	public Funcionario(String nome, int horasMensais, double valorHora) {
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasMensais() {
		return horasMensais;
	}
	public void setHorasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double pagamentoSalario() {
		return this.valorHora * this.horasMensais;
	}
	
}