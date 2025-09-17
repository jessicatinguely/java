package condicionais;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float nota1, nota2, nota3, nota4, media;

		System.out.println("Digite a 1 nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a 2 nota: ");
		nota2 = leia.nextFloat();

		System.out.println("Digite a 3 nota: ");
		nota3 = leia.nextFloat();

		System.out.println("Digite a 4 nota: ");
		nota4 = leia.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("A Média do aluno é %.2f%n", media);

		if (media >= 7) {
			System.out.println("Aluno foi aprovado!");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno em recuperação!");
		} else {
			System.out.println("Aluno foi reprovado!");
		}

		leia.close();

	}
}
