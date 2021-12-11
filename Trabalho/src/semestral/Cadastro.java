package semestral;

public class Cadastro {

	public static void main(String[] args) {

		System.out.println("----- Técnico 1 -----");

		Tecnico tecnico1 = new Tecnico();
		
		tecnico1.setNome("João José");
		tecnico1.setAnoNasc(1970);
		tecnico1.setAltura(1.73);
		tecnico1.setPeso(70.00);
		tecnico1.setApelido("JJ");
		tecnico1.setAnosExperiencia(15);
		tecnico1.setTempoContrato(2);
		tecnico1.mostrarDadosPessoa();
		tecnico1.calularidade(2021, 1970);
		tecnico1.mostrarDados();
		tecnico1.calculaSalario(1000, 2);

		System.out.println("\n----- Técnico 2 -----");

		Tecnico tecnico2 = new Tecnico();
		
		tecnico2.setNome("Marcelo Moreno");
		tecnico2.setAnoNasc(1980);
		tecnico2.setAltura(1.82);
		tecnico2.setPeso(85.00);
		tecnico2.setApelido("MM");
		tecnico2.setAnosExperiencia(10);
		tecnico2.setTempoContrato(3);
		tecnico2.mostrarDadosPessoa();
		tecnico2.calularidade(2021, 1980);
		tecnico2.mostrarDados();
		tecnico2.calculaSalario(1500, 3);

		System.out.println("\n----- Jogador 1 -----");

		Jogador jogador1 = new Jogador();
		
		jogador1.setNome("Sandro");
		jogador1.setAnoNasc(1989);
		jogador1.setAltura(1.71);
		jogador1.setPeso(80.00);
		jogador1.setNomeCamisa("Santos");
		jogador1.setPosicaoJoga("Meio de campo");
		jogador1.setNumGolCarreira(20);
		jogador1.mostrarDadosPessoa();
		jogador1.calularidade(2021, 1989);
		jogador1.mostrarDados();
		jogador1.calculaSalario(1000, 50);
		
		System.out.println("\n----- Jogador 2 -----");

		Jogador jogador2 = new Jogador();
		
		jogador2.setNome("Fernando");
		jogador2.setAnoNasc(1985);
		jogador2.setAltura(1.75);
		jogador2.setPeso(80.00);
		jogador2.setNomeCamisa("Nando");
		jogador2.setPosicaoJoga("Atacante");
		jogador2.setNumGolCarreira(150);
		jogador2.mostrarDadosPessoa();
		jogador2.calularidade(2021, 1985);
		jogador2.mostrarDados();
		jogador2.calculaSalario(1400, 50);

	}

}
