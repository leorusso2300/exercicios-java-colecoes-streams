package alura;

import java.util.List;

public class StreamComReduce {

	public static void main(String[] args) {

		// Imagine que você trabalha no setor financeiro de uma empresa e precisa
		// calcular o valor total gasto na compra de produtos.
		// No entanto, a empresa precisa considerar um imposto de 8% sobre o valor total
		// para definir corretamente o preço final dos produtos.
		//
		// Este programa:
		// - Cria uma lista contendo os preços dos produtos.
		// - Utiliza reduce() para calcular o total gasto.
		// - Calcula o valor do imposto (8%) sobre o total.
		// - Exibe o valor total antes e depois da aplicação do imposto, com duas casas
		// decimais.

		var precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

		var totalGasto = precosProdutos.stream().reduce(0.0, Double::sum);

		var totalComImposto = totalGasto + totalGasto * 0.08;

		System.out.printf("Valor total antes do imposto: R$ %.2f%n", totalGasto);
		System.out.printf("Valor total com imposto de 8%%: R$ %.2f%n", totalComImposto);
	}

}
