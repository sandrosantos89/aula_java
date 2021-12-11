package pessoa;

public class Professor extends Pessoa{
	private String titulacao;
	
	public void imprime2() {
		System.out.println("Titulacão: " + this.titulacao);
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}
