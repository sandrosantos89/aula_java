package contrutores_heranca;

public class Fornecedor extends Dados {
	private String nFantasia;
	private String website;

	public void imprimeForn() {
		System.out.println("Website: " + website);
	}

	public String getnFantasia() {
		return nFantasia;
	}

	public void setnFantasia(String nFantasia) {
		this.nFantasia = nFantasia;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
