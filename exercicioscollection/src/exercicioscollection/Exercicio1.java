package exercicioscollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
		for(int contador = 1; contador <= 5; contador ++) {
			System.out.print("Digite a " + contador + "ª cor: ");
			String cor = leia.nextLine();  // pega a String digitada
            cores.add(cor);                // adiciona no ArrayList
		
		}
            System.out.println("\nListar todas as cores:");
            for (String c : cores) {
                System.out.println(c);
            }

            Collections.sort(cores);

            System.out.println("\nOrdenar as cores:");
            for (String c : cores) {
                System.out.println(c);
            }
	        
		leia.close();

	}
	
}
