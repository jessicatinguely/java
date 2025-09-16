package exerciciosmod7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {	
		
		// Scanner para leitura de dados digitados pelo usuário
					Scanner leia = new Scanner(System.in);
		
		// Variáveis informadas pelo usuário: numero
		// Variáveis que iremos armazenar a soma dos números digitados

		int numero, somaPositivos = 0;

		// Leitura dos números até digitar 0
		do {

			System.out.println("Digite um número inteiro (zero para encerrar o programa): ");

			 // validação: só aceita inteiros
	        while (!leia.hasNextInt()) {
	            System.out.println("Entrada inválida! Digite um inteiro (zero para encerrar): ");
	            leia.next(); // descarta o token inválido
	        }
	        numero = leia.nextInt();

			if (numero > 0) {
				somaPositivos += numero;
			}
		} while (numero != 0);

		// Saída
		System.out.printf("A soma dos números positivos é: %d", somaPositivos);

		leia.close();
	}
}
