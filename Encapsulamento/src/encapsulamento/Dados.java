package encapsulamento;

import javax.swing.JOptionPane;

public class Dados {

	int base;
	int altura;
	int comprimento;
	int resultado;

	public void calcular(int base, int altura, int comprimento, int resultado) {

		base = Integer.parseInt(JOptionPane.showInputDialog("Informe a Base: "));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a Altura: "));
		comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento: "));
		resultado = base * altura * comprimento;

		this.base = base;
		this.altura = altura;
		this.comprimento = comprimento;
		this.resultado = resultado;

		JOptionPane.showMessageDialog(null, ("O volume necessário de cimento é: " + this.resultado));
	}

}
