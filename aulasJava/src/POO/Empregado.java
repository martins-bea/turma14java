package POO;


	public class Empregado extends Pessoa { //atributo proprio é CodigoSetor, SalarioBase e imposto impostos). 
		//Implemente a classe Empregado com métodos seletores e modificadorese um método calcularSalario.

		private int codigoSetor;
		private double salarioBase;
		private double imposto;

		public Empregado() {

		}

		public int getCodigoSetor() {
			return codigoSetor;
		}

		public double calcularSalario() {
			return this.salarioBase * (1 - imposto);
		}

		public void setCodigoSetor(int codigoSetor) {
			this.codigoSetor = codigoSetor;
		}

		public double getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(double salarioBase) {
			this.salarioBase = salarioBase;
		}

		public double getImposto() {
			return imposto;
		}

		public void setImposto(double imposto) {
			this.imposto = imposto;
		}

		public Empregado(String nome, String telefone, double salarioBase, double imposto) {
			super(nome, telefone);
			this.salarioBase = salarioBase;
			this.imposto = imposto;
		}

}
