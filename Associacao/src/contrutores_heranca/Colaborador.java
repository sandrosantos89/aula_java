package contrutores_heranca;

public class Colaborador extends Dados {
	private String cargo_funcao;
	
	public void imprimeCol (){
		System.out.println("Cargo ou funcão: " + cargo_funcao);
	}

	public String getCargo_funcao() {
		return cargo_funcao;
	}

	public void setCargo_funcao(String cargo_funcao) {
		this.cargo_funcao = cargo_funcao;
	}
	
	
}
