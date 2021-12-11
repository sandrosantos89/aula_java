package dados;

public class Controle {

	public static void main(String[] args) {

		PessoaFisica pf = new PessoaFisica();

		pf.setNome("Nova Pessoa Física");
		pf.setCpf("12345678910");
		pf.setRg("123456");
		pf.setIdade(32);
		pf.setTitulacao("Mestrado");
		pf.setLogradouro("Rua sem nome");
		pf.setNum(110);
		pf.setBairro("Estudos");
		pf.setCidade("Lógica");
		pf.setUf("SP");
		pf.setTelefone("123456");
		pf.setEmail("estudos@estudos.com.br");
		pf.setDisciplina("ADS");
		pf.imprime();
		pf.imprime3();

		PessoaJuridica pj = new PessoaJuridica();
//		pj.imprime2();

	}

}
