package controle;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Veiculo;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		Veiculo veiculo1 = new Veiculo();

		cliente1.setNome("José");
		cliente1.setCpf("12345678901");
		cliente1.setEndereco("Rua da oficina");
		cliente1.setEmail("email@email.com");
		cliente1.setTelefone("3212-32112");
		
		veiculo1.setModelo("Voyage");
		veiculo1.setAno("2020");
		veiculo1.setPlaca("ABC-1234");
		veiculo1.setFabricante("Volkswagen");
		veiculo1.setCor("Preto");
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("End: " + cliente1.getEndereco());
		System.out.println("E-mail: " + cliente1.getEmail());
		System.out.println("Telefone: " + cliente1.getTelefone());
		System.out.println("Modelo: " + veiculo1.getModelo());
		System.out.println("Ano: " + veiculo1.getAno());
		System.out.println("Palca: " + veiculo1.getPlaca());
		System.out.println("Fab: " + veiculo1.getFabricante());
		System.out.println("Cor: " + veiculo1.getCor());
	}

}
