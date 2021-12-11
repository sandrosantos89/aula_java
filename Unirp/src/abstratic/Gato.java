package abstratic;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}

	public void som() {
		System.out.println("o Gato " + nome + " faz Miau");
	}
}
