package cadastro_frota;

public class Vcarga extends Especificacoes {
	private String capMaxCargaKm;
	private String altura;
	private String largura;
	private String profundidade;
	
	public void imprime3() {
		System.out.println("Capacidade máxima: " + this.capMaxCargaKm + " Kg");
	}

	public String getCapMaxCargaKm() {
		return capMaxCargaKm;
	}

	public void setCapMaxCargaKm(String capMaxCargaKm) {
		this.capMaxCargaKm = capMaxCargaKm;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getLargura() {
		return largura;
	}

	public void setLargura(String largura) {
		this.largura = largura;
	}

	public String getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(String profundidade) {
		this.profundidade = profundidade;
	}

}
