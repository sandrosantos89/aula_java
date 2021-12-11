package calcula;

public class Retangulo extends Area {

	public void calculaArea(double altura, double base) {
		this.altura = altura;
		this.base = base;
		area = altura * base;
		System.out.println("O Valor da área do retangulo é: " + area);
	}

}
