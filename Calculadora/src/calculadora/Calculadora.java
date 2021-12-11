package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner calc = new Scanner(System.in);

		System.out.println(
				"Informe o número da operação que deseja: 1 - Soma, 2 - Subtração, 3 Divisão, 4 Multiplicação");
		int op = calc.nextInt();

		System.out.print("Digite o primeiro número: ");
		int num1 = calc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = calc.nextInt();
		try {
			switch (op) {
			case 1:
				System.out.println("Soma = " + (num1 + num2));
				break;

			case 2:
				System.out.println("Subtração = " + (num1 - num2));
				break;

			case 3:
				System.out.println("Divisão = " + (num1 / num2));
				break;

			case 4:
				System.out.println("Multiplicação = " + (num1 * num2));
				break;

			default:
				System.out.println("Erro operação inexistente");
			}
		} catch (Exception erro) {
			System.out.println("Seu erro foi: " + erro);

		}

	}
}
