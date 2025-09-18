package exerciciosmod7;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class exercicio4 {

	 public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);

	        // 10 valores inteiros
	        Set<Integer> numeros = new HashSet<Integer>();
	        numeros.add(2);
	        numeros.add(5);
	        numeros.add(1);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(9);
	        numeros.add(7);
	        numeros.add(8);
	        numeros.add(10);
	        numeros.add(6);

	        // Saida para solicitar o número que o usuário quer buscar e leia
	        System.out.print("Digite o número que você deseja encontrar: ");
	        int numeroBusca = leia.nextInt();

	        // If parta verificar se o numero foi encontrado
	        if (numeros.contains(numeroBusca)) {
	            System.out.printf("O número %d foi encontrado!%n", numeroBusca);
	        } else {
	            System.out.printf("O número %d não foi encontrado!%n", numeroBusca);
	        }

	        leia.close();
	    }
}
