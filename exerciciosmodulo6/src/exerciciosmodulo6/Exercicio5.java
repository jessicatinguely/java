package exerciciosmodulo6;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int produto, quantidade;
		

		System.out.println("==================================");
		System.out.println("            Cardápio              ");
		System.out.println("==================================");
		System.out.println("      1 - Cachorro Quente         ");
		System.out.println("      2 - X-Salada                ");
		System.out.println("      3 - X-Bacon                 ");
		System.out.println("      4 - Bauru                   ");
		System.out.println("      5 - Refrigerante            ");
		System.out.println("      6 - Suco de laranja         ");
		System.out.println("                                  ");
		System.out.println("==================================");

		System.out.println("Digite o código do produto: ");
		produto = leia.nextInt();

		System.out.println("Digite a quantidade desejada: ");
		quantidade = leia.nextInt();
		

		 switch (produto) {
         case 1:
             System.out.println("Produto: Cachorro Quente");
             System.out.printf("Valor total: R$ %.2f%n", quantidade * 10.0);
             break;
         case 2:
             System.out.println("Produto: X-Salada");
             System.out.printf("Valor total: R$ %.2f%n", quantidade * 15.0);
             break;
         case 3:
             System.out.println("Produto: X-Bacon");
             System.out.printf("Valor total: R$ %.2f%n", quantidade * 18.0);
             break;
         case 4:
             System.out.println("Produto: Bauru");
             System.out.printf("Valor total: R$ %.2f%n", quantidade * 12.0);
             break;
         case 5:
             System.out.println("Produto: Refrigerante");
             System.out.printf("Valor total: R$ %.2f%n", quantidade * 8.0);
             break;
         case 6:
             System.out.println("Produto: Suco de Laranja");
             System.out.printf("Valor total: R$ %.2f%n", quantidade * 13.0);
             break;
         default:
             System.out.println("Código inválido!");

		}

		leia.close();

	}
}
