package exerciciosmod7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new TreeSet<Integer>();

        System.out.println("Você deverá digitar 10 números (um por vez):");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = leia.nextInt();
            numeros.add(numero); 
        }

        System.out.println("\nListar dados do Set:");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        leia.close();
    }
}
