package exerciciosmod8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Vetor fixo com 10 números inteiros (não ordenados e não repetidos)

		int numerosVetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		int numeroBusca;

		boolean busca = false; // flag para saber se achou

		// Coletar o número a ser pesquisado

		System.out.println("Digite o número que você deseja encontra: ");
		numeroBusca = leia.nextInt();

		// Percorre o vetor inteiro

		for (int indice = 0; indice < numerosVetor.length; indice++) {

			// Verifica se o número atual do vetor é igual ao número pesquisado

			if (numerosVetor[indice] == numeroBusca) {
				System.out.printf("O número %d está localizado na posição: %d", numeroBusca, indice);
				busca = true; // marca que encontrou o número pesquisado
				break; // sair do loop para o caso em questáo serve pois os números ão se repetem.
			}
		}
		
        // Caso o número pesquisado não tenha sido encontrado
		if (!busca) {

			System.out.printf("O número %d não foi encontrado!%n", numeroBusca);
		}

		leia.close();

	}

}
