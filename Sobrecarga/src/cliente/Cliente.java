package cliente;

public class Cliente {
	String nome;
	String sobrenome;
	int idade;

	public Cliente() {

	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;

	}

	public String toString() {
		return "Nome: " +nome + " Sobrenome: " + sobrenome + " Idade: " + idade;
	}

}
