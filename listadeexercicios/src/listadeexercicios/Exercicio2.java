package listadeexercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		// Entrada de dados
		Scanner leia = new Scanner(System.in);

		// define quantas notas
		int qtd;
		System.out.println("Digite a quantidade de notas: ");
		qtd = leia.nextInt();

		// criação do Array com tamanho variado
		float[] notas = new float[qtd];

		// loop entrada
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			notas[i] = leia.nextFloat();
		}

		// soma das notas
		float soma = 0;

		for (int i = 0; i < qtd; i++) {
			soma += notas[i];
		}

		float media = soma / notas.length;

		// Saída formatada
		System.out.printf("Média final das %d notas: %.1f%n", qtd, media);

		leia.close();
	}
}
