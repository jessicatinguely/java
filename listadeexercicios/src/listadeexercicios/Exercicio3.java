package listadeexercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Variáveis (float)
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		// Entrada de dados
		System.out.print("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.print("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();

		System.out.print("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();

		System.out.print("Digite os Descontos: ");
		descontos = leia.nextFloat();

		// salário líquido = bruto + adicional + (horas * 5) - descontos
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		// Saída formatada
		System.out.printf("Salário Líquido: %.2f%n", salarioLiquido);

		leia.close();
	}
}
