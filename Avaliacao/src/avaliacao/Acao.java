package avaliacao;

import javax.swing.JOptionPane;

public class Acao implements Modelo {

	public static void main(String[] args) {

		int acao = Integer.parseInt(JOptionPane
				.showInputDialog("Digite 1 para conceito A. \nDigite 2 para conceito B. \nDigite 3 para conceito C. "));

		if (acao == 1) {

			JOptionPane.showMessageDialog(null, Modelo.a);

		} else if (acao == 2) {
			JOptionPane.showMessageDialog(null, Modelo.b);

		} else {
			JOptionPane.showMessageDialog(null, Modelo.c);

		}

	}

}
