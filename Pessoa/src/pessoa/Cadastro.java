package pessoa;


public class Cadastro {
	public static void main(String[]args) {
	Professor prof = new Professor();
	
	System.out.println("Novo Professor");
	prof.setNome("Sandro");
	prof.setRg("123456");
	prof.setCpf("123456");
	prof.setTitulacao("Senior");
	
	prof.imprime();
	prof.imprime2();	
	
	

}
}