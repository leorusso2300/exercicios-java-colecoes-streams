package alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Sistema de gerenciamento de clientes.
 * 
 * Armazena cinco clientes utilizando um Map<Integer, String>, onde a chave é o
 * ID e o valor é o nome do cliente. Permite buscar um cliente pelo ID informado
 * via teclado. Caso o ID exista, exibe o nome do cliente; caso contrário,
 * informa que o cliente não foi encontrado.
 */

public class ExemploUsoMap {

	public static void main(String[] args) {

		int id;
		Scanner leitor = new Scanner(System.in);

		Map<Integer, String> clientes = new HashMap<>();
		clientes.put(1, "Maria");
		clientes.put(2, "Marcos");
		clientes.put(3, "Ana");
		clientes.put(4, "Joana");
		clientes.put(5, "Karen");

		System.out.print("Digite o Id do cliente: ");
		id = leitor.nextInt();

		if (clientes.get(id) != null) {
			System.out.println("O nome do cliente com ID " + id + " é: " + clientes.get(id));
		} else {
			System.out.println("Cliente com ID " + id + " não encontrado.");
		}

		leitor.close();

	}

}
