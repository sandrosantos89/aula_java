package veiculos;

public class VehicleDemo {

	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		int range1;
		int range2;

		minivan.passageiros = 7;
		minivan.combustivel = 16;
		minivan.milhas = 21;

		sportcar.passageiros = 2;
		sportcar.combustivel = 14;
		sportcar.milhas = 12;

		range1 = minivan.combustivel * minivan.milhas;
		range2 = sportcar.combustivel * sportcar.milhas;

		System.out.println("A Minivan pode carregar " + minivan.passageiros + " Passageiros com uma autonomia de "
				+ range1 + " Milhas");
		System.out.println("O Sportcar pode carregar " + sportcar.passageiros + " Passageiros com uma autonomia de "
				+ range2 + " Milhas");

	}

}
