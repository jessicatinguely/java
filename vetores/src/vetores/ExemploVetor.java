package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nomes[] = { "Cintia", "Stella", "Patricia", "Rafaela", "Leticia", "Jamila", "Priscila" };

		int numeros[] = new int[5];

		System.out.println("Listagem - Vetor Nomes");

		// Ordenar o vetor

		Arrays.sort(nomes); // colocar em ordem crescente

		Arrays.sort(nomes, Collections.reverseOrder()); // inverte a relação - decrescente

		for (int indice = 0; indice < nomes.length; indice++) { // lenght traz a quantidade certa e atualizada da lista,
																// sem necessidade de colocar um numero
			System.out.printf("nomes[%d] = %s%n", indice, nomes[indice]);
		}

		System.out.println("\nInput de dados- Vetor Numeros");

		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Digite um numero para posição " + indice + ":");
			numeros[indice] = leia.nextInt();
		}

		System.out.println("Listagem - Vetor Numeros");

		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.printf("numeros[%d] = %d%n", indice, numeros[indice]);
		}

		leia.close();

	}

}
