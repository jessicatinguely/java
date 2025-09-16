package exerciciosmod7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		// Scanner para leitura de dados digitados pelo usuário
		Scanner leia = new Scanner(System.in);
		
		// Variáveis informadas pelo usuário: idade
		// Variáveis que iremos armazenar a quantidade de pessoas 
		//idadem21 conta quantas pessoas têm idade < 21 e idadeM50 conta quantas pessoas têm idade > 50
		
		int idade, qtdMenor21 = 0, qtdMaior50 = 0;
		
		// Entrada da variável e leitura dos dados até usuário digitar idade negativa
		// Usei while true para náo repetir a linha de leitura de idade de novo antes e depois do laço
		while (true) {
		    System.out.println("Digite uma idade (negativa para encerrar): ");
		    idade = leia.nextInt();

		    if (idade < 0) break; // condição de parada e termino de leitura dos dados 

		    if (idade < 21) {
		    	qtdMenor21++;
		    } else if (idade > 50) {
		    	qtdMaior50++;
		    }
		}
		// Saídas
		System.out.println("\n========== RESULTADO FINAL ==========");
		System.out.printf("Total de pessoas menores de 21 anos: %d%n", qtdMenor21);
		System.out.printf("Total de pessoas maiores de 50 anos: %d%n", qtdMaior50);

		leia.close();
		
		}

	}



