package calcula;

public class Quadrado  extends Area{

	public void calculaArea(double base) {
		this.base = base;
		area = base * base;
		System.out.println("O Valor da área do quadrado é: " + area);
	}
}
