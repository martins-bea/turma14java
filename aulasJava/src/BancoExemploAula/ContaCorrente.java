package BancoExemploAula;

	public class ContaCorrente extends Conta 
	{
		protected int TalaoCheque;

		
		
		public ContaCorrente(int numeroConta) {
			super(numeroConta);
		}
		public ContaCorrente(int numeroConta, String cpf) {
			super(numeroConta, cpf);
		}

		
		public int getTalaoCheque() {
			return TalaoCheque;
		}

		public void setTalaoCheque(int numeroTalaoCheque) {
			this.TalaoCheque = numeroTalaoCheque;
		}
}
