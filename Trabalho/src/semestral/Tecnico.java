package semestral;

public class Tecnico extends Pessoa {

	private String apelido;
	private int anosExperiencia;
	private int tempoContrato;

	public void calculaSalario(double salarioBase, int horasExtras) {

		salario = salarioBase + (350 * horasExtras);

		System.out.println("Salário: " + salario);

	}

	public void mostrarDados() {
		System.out.println("Apelido: " + apelido);
		System.out.println("Anos de experiência: " + anosExperiencia);
		System.out.println("Tempo de contrato: " + tempoContrato + " anos");
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public int getTempoContrato() {
		return tempoContrato;
	}

	public void setTempoContrato(int tempoContrato) {
		this.tempoContrato = tempoContrato;
	}

}
