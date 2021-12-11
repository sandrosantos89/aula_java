package semestral;

public abstract class Pessoa {

	private String nome;
	private int anoNasc;
	private int idade;
	private double altura;
	private double peso;
	protected double salario;
	private int anoAtual;

	public void calculaSalario() {

	}

	public void mostrarDados() {

	}

	public void calularidade(int anoAtual, int anoNasc) {
		this.anoAtual = anoAtual;
		this.anoNasc = anoNasc;
		idade = anoAtual - anoNasc;

		System.out.println("Idade: " + idade + " anos");
	}

	public void mostrarDadosPessoa() {
		System.out.println("Nome: " + nome);
		System.out.println("Ano de nascimento: " + anoNasc);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

}
