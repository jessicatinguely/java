package exerciciosmodulo6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float numeroA, numeroB, numeroC, soma;

		System.out.println("Digite o número A:");
		numeroA = leia.nextFloat();

		System.out.println("Digite o número B:");
		numeroB = leia.nextFloat();

		System.out.println("Digite o número C:");
		numeroC = leia.nextFloat();

		soma = numeroA + numeroB;

		if (soma > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else if(soma == numeroC) {
			System.out.println("A Soma de A + B é Igual a C");
		} else {
		    System.out.println("Erro: valor inesperado!");
		}
		leia.close();

	}

}
