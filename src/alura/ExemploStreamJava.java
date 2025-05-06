package alura;

import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamJava {

	public static void main(String[] args) {

		// Lista imutável com nomes
		List<String> nomes = List.of("Leonardo", "Ana", "Melissa", "Fatima", "Amanda");

		// Filtrando nomes que começam com a letra "A"
		// A operação filter() retorna apenas os elementos que atendem à condição
		// Coletamos o resultado em uma lista mutável usando
		// collect(Collectors.toList())
		List<String> nomeLetraA = nomes.stream().filter(nome -> nome.startsWith("A")).collect(Collectors.toList());

		// Exibe a lista de nomes que começam com "A"
		System.out.println(nomeLetraA);

		// Lista imutável com valores de vendas
		List<Double> valorVendas = List.of(500.0, 600.0, 800.0);

		// Calculando comissão de 5% para cada venda
		// A operação map() transforma cada valor da lista original em um novo valor (v
		// * 0.05)
		List<Double> comissao = valorVendas.stream().map(v -> v * 0.05).collect(Collectors.toList());

		// Exibe os valores originais de venda
		System.out.println("Valor vendas: " + valorVendas);

		// Exibe as comissões calculadas
		System.out.println("Comissão: " + comissao);

		// Somando o total de vendas usando reduce()
		// O reduce() aplica uma função acumuladora (nesse caso, Double::sum) aos
		// elementos do stream
		// Começa com 0.0 e vai somando todos os valores da lista
		double totalVendas = valorVendas.stream().reduce(0.0, Double::sum);

		// Exibe o total das vendas
		System.out.println("Total vendas: " + totalVendas);
	}
}
