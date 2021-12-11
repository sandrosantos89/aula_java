package cadastro_frota;

public class Testando {

	public static void main(String[] args) {

		Vpassageiro pass = new Vpassageiro();
		Vcarga carga = new Vcarga();
		
		//Testando a aplicação
		pass.setPlaca("ABC - 1234");
		pass.setProcedencia("Nacional");
		pass.setPassageiros("4");
		carga.setCapMaxCargaKm("250");	
		pass.setCorExterna("Vermelho");
		pass.imprime();
		pass.imprime2();
		carga.imprime3();

	}

}
