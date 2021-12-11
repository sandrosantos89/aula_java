package cadastro_frota;

public class Vpassageiro extends Especificacoes {

	private String corInterna;
	private String corExterna;
	private String nPortas;
	private String Passageiros;
	private String opicionais;
	
	public void imprime2() {
		
		System.out.println("Qtde Passageiros: " + this.Passageiros);
		System.out.println("Cor Externa: " + this.corExterna);
	}

	public String getCorInterna() {
		return corInterna;
	}

	public void setCorInterna(String corInterna) {
		this.corInterna = corInterna;
	}

	public String getCorExterna() {
		return corExterna;
	}

	public void setCorExterna(String corExterna) {
		this.corExterna = corExterna;
	}

	public String getnPortas() {
		return nPortas;
	}

	public void setnPortas(String nPortas) {
		this.nPortas = nPortas;
	}

	public String getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(String Passageiros) {
		this.Passageiros = Passageiros;
	}

	public String getOpicionais() {
		return opicionais;
	}

	public void setOpicionais(String opicionais) {
		this.opicionais = opicionais;
	}

}
