package listadeexercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Variáveis (float)
		float n1, n2, n3, n4, resultado;

		// Entrada de dados
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextFloat();

		System.out.print("Digite o segundo número: ");
		n2 = leia.nextFloat();

		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextFloat();

		System.out.print("Digite o quarto número: ");
		n4 = leia.nextFloat();

		// Cálculo: diferença = (n1 * n2) - (n3 * n4)
		resultado = multiplica(n1, n2) - multiplica(n3, n4);

		// Saída formatada
		System.out.printf("Diferença: %.1f%n", resultado);

		leia.close();
	}

	private static float multiplica(float a, float b) {
		return a * b;
	}

}
