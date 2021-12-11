package area;

public class Area {
	double area;
	double lado;
	double base;
	double altura;
	double baseMenor;
	double baseMaior;

	public void calculaArea(double lado) {

		this.lado = lado;
		area = lado * lado;

		System.out.println("Área do quadrado: " + area);
	}

	public void calculaArea(double base, double altura) {
		this.base = base;
		this.altura = altura;
		area = base * altura;
		
	System.out.println("Área do Quadrado: " + area);
	}

	public void calculaArea(double baseMaior, double baseMenor, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		area = ((baseMaior + baseMenor) * altura) / 2;

		System.out.println("Área do Trapezío: " + area);
	}

}