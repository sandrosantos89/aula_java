package contrutores_heranca;

public class Associados extends Dados {
	private String situacao;
	private String nAssociados;

	public void imprimeAss() {
		System.out.println("Situação: " + situacao);
		System.out.println("Número de associado: " + nAssociados);
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getnAssociados() {
		return nAssociados;
	}

	public void setnAssociados(String nAssociados) {
		this.nAssociados = nAssociados;
	}

}
