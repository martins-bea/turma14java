package BancoG5;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numeroConta) {
		super(numeroConta);
		// TODO Auto-generated constructor stub
	}
	private int talaoLimite=3;
	private int qntdTalao;
	private int talaooutrodia;
	
	public int getTalaoLimite() {
		return talaoLimite;
	}
	public int getQntdTalao() {
		return qntdTalao;
	}
	public int getTalaooutrodia() {
		return talaooutrodia;
	}
	public void setTalaooutrodia(int talaooutrodia) {
		this.talaooutrodia = talaooutrodia;
	}
	public void talao (int qntdTalao) {
	
		if (qntdTalao > 3 || qntdTalao < 0) {
				System.out.printf("Quantidade de tal�es inv�lida. Voc� possui  %d tal�es dispon�veis no momento", this.qntdTalao);
		}
		else if(qntdTalao < 3) {
			this.talaoLimite -= this.qntdTalao;
			System.out.printf("A quantidade impressa de tal�o hoje � de: %d\n", this.qntdTalao);	
		}
		else {
			this.qntdTalao = 3;
		}
	
	}
	
}
