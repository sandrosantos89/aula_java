package interfaces;

public class Imprime implements Contrato {
	String texto;
	

	@Override
	public void entrarComTexto(String texto) {
		
		System.out.println(texto);
	}
	
}
