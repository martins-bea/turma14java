package Banco;

public class ContaCorrente extends Conta{

	private int talaoLimite=3;
	private int qntdTalao;
	private int talaooutrodia;
	
	
	public ContaCorrente(int talaoLimite, int qntdTalao) {
		this.talaoLimite = talaoLimite;
		this.qntdTalao = 0;
	}
	

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
				System.out.printf("Quantidade de talões inválida. Você possui  %d talões disponíveis no momento", this.qntdTalao);
		}
		else if(qntdTalao < 3) {
			this.talaoLimite -= this.qntdTalao;
			System.out.printf("A quantidade impressa de talão hoje é de: %d\n", this.qntdTalao);	
		}
		else {
			this.qntdTalao = 3;
		}
	
	}
	
}
