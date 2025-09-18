package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set <String> frutas = new HashSet<String>();
		
		frutas.add("Banana");
		frutas.add("Maça");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");

		for(String fruta : frutas) {
		System.out.println(fruta.hashCode());
	
		}
		
		frutas.remove("Abacate");
		
		System.out.println(frutas);
		
		System.out.println("A fruta Amora está presente no set? " + frutas.contains("Amora"));
		
		System.out.println("O set está vazio? ");
		
		Iterator<String> itfrutas = frutas.iterator();
	}

}
