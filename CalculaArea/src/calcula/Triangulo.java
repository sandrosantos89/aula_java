package calcula;

public class Triangulo extends Area {

	public void calculaArea(double base, double altura) {
		this.base = base;
		this.altura = altura;

		area = (base * altura) / 2;
		System.out.println("O Valor da área do triângulo é: " + area);
	}
}
