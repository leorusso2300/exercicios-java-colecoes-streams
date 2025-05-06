package alura;

import java.util.List;

/**
 * Você deseja analisar as notas dos alunos e alunas em uma disciplina para
 * entender melhor o desempenho da turma. Além da média, você também quer saber
 * a menor e a maior nota para ter um panorama completo.
 * 
 * Este programa: - Cria uma lista contendo as notas dos alunos. - Utiliza
 * reduce() para calcular a soma total das notas. - Calcula a média das notas. -
 * Determina a menor e a maior nota da lista usando a API de Stream (min e max).
 * - Exibe os resultados no console.
 */

public class NotasComReduce {
	public static void main(String[] args) {

		List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
		var totalNotas = notas.stream().reduce(Double::sum);

		System.out.println("A média das notas é:" + totalNotas.get() / notas.size());
		System.out.println("A menor nota foi: " + notas.stream().min(Double::compare).get());
		System.out.println("A maior nota foi: " + notas.stream().max(Double::compare).get());

	}
}
