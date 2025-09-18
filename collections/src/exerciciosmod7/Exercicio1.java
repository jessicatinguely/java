package exerciciosmod7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		// Scanner para leitura de dados digitados pelo usuário
		Scanner leia = new Scanner(System.in);

		// Variáveis informadas pelo usuário

		int num1, num2;

		// Entrada dos limites do intervalo

		System.out.printf("Digite o primeiro número do intervalo: %n");
		num1 = leia.nextInt();

		System.out.printf("Digite último número do intervalo: %n");
		num2 = leia.nextInt();

		// Validação do intervalo:
		// se o segundo número não for maior que o primeiro, não faz sentido continuar

		if (num2 <= num1) {
			System.out.println("Intervalo Inválido!");
			leia.close();
			return;
		}

		// Saída

		System.out.printf("No intervalo entre %d e %d:%n", num1, num2);

		// Controle caso não existam múltiplos
		boolean encontrou = false;

		// Laço percorre todo o intervalo de num1 até num2
		// Dentro do laço, testamos se o número atual é múltiplo de 3 E de 5

		for (int contador = num1; contador <= num2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {

				// Impressão formatada

				System.out.printf("%d é multiplo de 3 e 5%n", contador);
				encontrou = true;

				}
			}
		
		// Caso não tenha encontrado nenhum múltiplo
		if (!encontrou) {
			System.out.println("Nenhum múltiplo de 3 e 5 encontrado no intervalo.");
			
		}

		leia.close();

	}

}
