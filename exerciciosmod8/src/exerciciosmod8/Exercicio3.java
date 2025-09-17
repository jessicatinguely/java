package exerciciosmod8;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];

		String diagonalPrincipal = "", diagonalSecundaria = "";

		int somaPrincipal = 0, somaSecundaria = 0;

		// Leitura da matriz 3x3
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("matriz[%d][%d] = ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		// Diagonal Principal
		for (int i = 0; i < matriz.length; i++) {
			diagonalPrincipal += matriz[i][i] + " ";
			somaPrincipal += matriz[i][i];
		}

		// Diagonal Secundária
		for (int i = 0; i < matriz.length; i++) {
			diagonalSecundaria += matriz[i][matriz.length - 1 - i] + " ";
			somaSecundaria += matriz[i][matriz.length - 1 - i];
		}

		// Impressões finais
		System.out.println("Diagonal Principal: " + diagonalPrincipal);
		System.out.println("Diagonal Secundária: " + diagonalSecundaria);
		System.out.println("Soma dos elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos elementos da Diagonal Secundária: " + somaSecundaria);

		leia.close();
	}
}
