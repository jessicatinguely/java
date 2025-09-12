package listadeexercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		// Entrada de dados
		Scanner leia = new Scanner(System.in);

		// Definir as variáveis
		float salario, abono;

		// Entrada de dados
		System.out.println("Digite o valor do seu salário: ");
		salario = leia.nextFloat();

		System.out.println("Digite o valor do seu abono: ");
		abono = leia.nextFloat();

		float novoSalario = salario + abono;

		// Efetuar o cálculo
		System.out.printf("Novo Salário: %.2f%n", novoSalario);

		System.out.printf("(Detalhe: Salário %.2f + Abono %.2f)%n", salario, abono);

		leia.close();
	}

}
