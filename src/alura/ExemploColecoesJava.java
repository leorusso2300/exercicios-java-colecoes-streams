package alura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploColecoesJava {

	public static void main(String[] args) {

		// Criando uma lista utilizando a implementação ArrayList
		// O ArrayList é baseado em um array redimensionável (dinâmico).
		// Vantagem: acesso rápido aos elementos por índice (ex: list.get(0)).
		// Desvantagem: inserções e remoções no início ou no meio da lista podem ser
		// lentas,
		// pois é necessário mover os elementos seguintes para manter a ordem.
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Leonardo");
		arrayList.add("Melissa");
		arrayList.add("Ana");

		System.out.println("ArrayList: " + arrayList);

		// Criando uma lista utilizando a implementação LinkedList
		// A LinkedList é baseada em uma estrutura de nós encadeados (lista duplamente
		// ligada).
		// Vantagem: inserções e remoções em qualquer posição são mais eficientes,
		// pois basta alterar os ponteiros dos nós vizinhos.
		// Desvantagem: acesso por índice é mais lento, pois é necessário percorrer os
		// nós um a um.
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Leonardo");
		linkedList.add("Melissa");
		linkedList.add("Ana");

		System.out.println("LinkedList: " + linkedList);

		// Criando um conjunto (Set) utilizando a implementação HashSet
		// O HashSet é uma coleção que:
		// - Não permite elementos duplicados
		// - Não garante a ordem de inserção
		// - Utiliza uma tabela de espalhamento (hash table) para armazenamento
		// Ideal para quando se deseja armazenar itens únicos e não se importa com a
		// ordem
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Leonardo");
		hashSet.add("Melissa");
		hashSet.add("Ana");
		hashSet.add("Leonardo"); // Este elemento duplicado será ignorado automaticamente

		System.out.println("HashSet (sem duplicatas e sem ordem garantida): " + hashSet);

		// Criando um mapa utilizando a implementação HashMap
		// O HashMap armazena pares chave-valor (key-value), e permite:
		// - Inserção rápida de elementos
		// - Acesso direto ao valor pela chave (ex: map.get(1))
		// - Chaves são únicas (valores podem se repetir)
		// - Não garante ordem de inserção
		// Ideal para representar relações de associação, como ID → objeto ou nome →
		// telefone
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Cliente 1");
		hashMap.put(2, "Cliente 2");
		hashMap.put(3, "Cliente 3");
		hashMap.put(4, "Cliente 4");

		System.out.println("HashMap (pares chave-valor, sem ordem garantida): " + hashMap);
	}
}
