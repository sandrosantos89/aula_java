package desafio1;

import javax.swing.JOptionPane;

public class Principal {
	public static void main (String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Sandro Santos";
		aluno1.endereco = "Rua sem nome";
		aluno1.email = "treinando@estudar.com.br";
		aluno1.telefone = "3212-3456";
		aluno1.matricula = 20210751;
		
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Endereço: " + aluno1.endereco);
		System.out.println("Email: " + aluno1.email);
		System.out.println("Telefone: " + aluno1.telefone);
		System.out.println("Matricula: " + aluno1.matricula);
	}

}
