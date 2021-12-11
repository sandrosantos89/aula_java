package cliente;

public class Controle {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente("Sandro");
		Cliente c3 = new Cliente("Sandro", "Santos", 32);
		
		System.out.println(c2);
	}

}
