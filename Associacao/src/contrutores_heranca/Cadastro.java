package contrutores_heranca;

public class Cadastro {

	public static void main(String[] args) {

		Dados dd = new Dados();
		Associados ass = new Associados();
		Colaborador col = new Colaborador();
		Fornecedor forn = new Fornecedor();

		dd.setId("001");
		ass.setSituacao("Ativo");
		ass.setnAssociados("0001");
		col.setCargo_funcao("Auxiliar");
		forn.setWebsite("www.aprendendo.com.br");

		dd.imprimeDados();
		ass.imprimeAss();
		col.imprimeCol();
		forn.imprimeForn();

	}

}
