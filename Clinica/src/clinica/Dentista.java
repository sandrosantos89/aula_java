package clinica;


public class Dentista {
	//classe é coesa por estar tudo relacionado a classe Dentista
	String nome;
	String especialidade;
	String registro;
	
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getEspecialidade() {
		return especialidade;
	}
	private void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	private String getRegistro() {
		return registro;
	}
	private void setRegistro(String registro) {
		this.registro = registro;
	}
	
	
}
