package dados;

public class PessoaJuridica extends DadosGerais{
	private String razaoSocial;
	private String nomeFantasia;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	private String cnpj;
	private String website;
	
	public void imprime2() {
		System.out.println("Razão Social: " + razaoSocial);
		System.out.println("Nome Fantasia: " + nomeFantasia);
		System.out.println("Inscrição Estadual: " + inscricaoEstadual);
		System.out.println("Inscrição Municipal: " + inscricaoMunicipal);
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Wibsite: " + website);
		
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	

}
