package alura;

import java.util.ArrayList;
import java.util.List;

/**
 * Você está trabalhando no sistema de gestão de uma escola,
 * garantindo que a lista de estudantes esteja sempre correta.
 * Durante uma revisão nos cadastros, percebeu que um nome foi
 * adicionado incorretamente: “Pedro”. Para evitar confusões
 * na emissão de certificados e registros, você precisa corrigir
 * essa informação imediatamente.
 *
 * Sua tarefa é remover o nome “Pedro” da lista.
 * Considere que a lista inicial possui os seguintes nomes:
 * Joana, Lucas, Pedro e Antônio.
 */
public class ManipulacaoDeLista {

	public static void main(String[] args) {

		List<String> listaInicial = new ArrayList<>();
		listaInicial.add("Joana");
		listaInicial.add("Lucas");
		listaInicial.add("Pedro");
		listaInicial.add("Antônio");

		System.out.println("Lista inicial: " + listaInicial);
		listaInicial.remove("Pedro");
		System.out.println("Lista após a exclusão: " + listaInicial);

	}

}
