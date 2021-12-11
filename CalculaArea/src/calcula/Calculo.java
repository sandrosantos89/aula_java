package calcula;

public class Calculo {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		
		quadrado.calculaArea(2);
		retangulo.calculaArea(10, 5);
		triangulo.calculaArea(10, 5);
	
		}
}
