 package area;

public class Controle {

	public static void main(String[] args) {

		Area quad = new Area();
		quad.calculaArea(9);

		Area retang = new Area();
		retang.calculaArea(10, 15);

		Area trap = new Area();
		trap.calculaArea(15, 2, 5);

		if (quad.area >= retang.area) {

			System.out.println("A área do Quadrado é maior que a área do Retangulo");

		} else {
			System.out.println("A área do Quadrado é menor que a área do Retangulo");
		}
		if (quad.area >= trap.area) {

			System.out.println("A área do Quadrado é maior que a área do Trapézio");

		} else {
			System.out.println("A área do Quadrado é menor que a área do Trapézio");
		}
	}

}
