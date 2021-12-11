package abstratic;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super(nome);
	}

	public void som() {
		System.out.println("o Cachorro " + nome + " faz Au Au");
	}
}
