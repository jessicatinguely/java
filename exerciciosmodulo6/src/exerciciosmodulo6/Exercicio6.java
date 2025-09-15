package exerciciosmodulo6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int cargo;
		double salario;

        System.out.print("Nome do colaborador: ");
        nome = leia.nextLine();

        System.out.print("Código do Cargo (1 a 6): ");
        cargo = leia.nextInt();

        System.out.print("Salário: R$ ");
        salario = leia.nextDouble();

        System.out.println("\nNome do colaborador: " + nome);

        switch (cargo) {
            case 1:
                System.out.println("Cargo: Gerente");
                System.out.printf("Salário: R$ %.2f%n", salario * 1.10);
                break;
            case 2:
                System.out.println("Cargo: Vendedor");
                System.out.printf("Salário: R$ %.2f%n", salario * 1.07);
                break;
            case 3:
                System.out.println("Cargo: Supervisor");
                System.out.printf("Salário: R$ %.2f%n", salario * 1.09);
                break;
            case 4:
                System.out.println("Cargo: Motorista");
                System.out.printf("Salário: R$ %.2f%n", salario * 1.06);
                break;
            case 5:
                System.out.println("Cargo: Estoquista");
                System.out.printf("Salário: R$ %.2f%n", salario * 1.05);
                break;
            case 6:
                System.out.println("Cargo: Técnico de TI");
                System.out.printf("Salário: R$ %.2f%n", salario * 1.08);
                break;
            default:
                System.out.println("Código inválido!");

		leia.close();
	}
	}
	
}
