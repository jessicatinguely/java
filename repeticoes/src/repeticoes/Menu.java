package repeticoes;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao = 1;
		
		while(opcao == 0) {
			
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
		}
		
		leia.close();


	}

}
