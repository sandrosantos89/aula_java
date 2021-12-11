package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do produto: ");
		System.out.print("nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		Produto p = new Produto(nome, preco, quantidade);

		System.out.println("Dados do Produto: " + p);
		System.out.println();

		System.out.print("Informe o número de produtos que deseja add no estoque: ");
		quantidade = sc.nextInt();
		p.addProdutos(quantidade);
		System.out.println();

		System.out.println("Dados do Produto: " + p);
		System.out.println();

		System.out.print("Informe o número de produtos que deseja remover do estoque: ");
		quantidade = sc.nextInt();
		p.removeProdutos(quantidade);
		System.out.println();

		System.out.println("Dados do Produto: " + p);
		System.out.println();
		sc.close();

	}

}
