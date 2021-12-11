import javax.swing.JOptionPane;

public class media {

	private String nome;
	private String sobrenome;

	public void imprimeTela(String nome, String sobrenome) {

		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");

		this.nome = nome;
		this.sobrenome = sobrenome;

		JOptionPane.showMessageDialog(null, this.nome + " " + sobrenome);
	}

}
