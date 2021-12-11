package semestral;

public class Jogador extends Pessoa {

	private String nomeCamisa;
	private String posicaoJoga;
	private int numGolCarreira;

	public void calculaSalario(double salarioBase, double bonus) {

		salario = salarioBase + (5 * bonus);

		System.out.println("Salário: " + salario);
	}

	public void mostrarDados() {
		System.out.println("Nome na camisa: " + nomeCamisa);
		System.out.println("Posição que joga: " + posicaoJoga);
		System.out.println("Número de gols na carreira: " + numGolCarreira);
	}

	public String getNomeCamisa() {
		return nomeCamisa;
	}

	public void setNomeCamisa(String nomeCamisa) {
		this.nomeCamisa = nomeCamisa;
	}

	public String getPosicaoJoga() {
		return posicaoJoga;
	}

	public void setPosicaoJoga(String posicaoJoga) {
		this.posicaoJoga = posicaoJoga;
	}

	public int getNumGolCarreira() {
		return numGolCarreira;
	}

	public void setNumGolCarreira(int numGolCarreira) {
		this.numGolCarreira = numGolCarreira;
	}

}
