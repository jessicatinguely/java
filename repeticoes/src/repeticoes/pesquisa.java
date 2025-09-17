package repeticoes;

import java.util.Scanner;

public class pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int idade, esporte,totalRespostas =0, futebol =0, voleiM18 =0, basquetem18 =0;
		
		long somaIdades = 0;
		
		double mediaIdades = 0;
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa - Esporte Favorito");
			
			  // ===== valida IDADE =====
			System.out.print("Digite a sua idade (1 a 120): ");
            while (!leia.hasNextInt()) {
                System.out.print("Entrada inválida! Digite um número inteiro para idade: ");
                leia.next(); // descarta o token inválido
            }
            idade = leia.nextInt();
            while (idade < 1 || idade > 120) {
                System.out.print("Idade fora do intervalo! Digite entre 1 e 120: ");
                while (!leia.hasNextInt()) {
                    System.out.print("Entrada inválida! Digite um número inteiro para idade: ");
                    leia.next();
                }
                idade = leia.nextInt();
            }
			
			System.out.println("1 - Futebol ");
			System.out.println("2 - Voleibol ");
			System.out.println("3 - Basquetebol ");
			
			// ===== valida ESPORTE =====
            System.out.print("Digite o seu esporte favorito (1/2/3): ");
            while (!leia.hasNextInt()) {
                System.out.print("Entrada inválida! Digite 1, 2 ou 3: ");
                leia.next();
            }
            esporte = leia.nextInt();
            while (esporte < 1 || esporte > 3) {
                System.out.print("Código inválido! Digite 1, 2 ou 3: ");
                while (!leia.hasNextInt()) {
                    System.out.print("Entrada inválida! Digite 1, 2 ou 3: ");
                    leia.next();
                }
                esporte = leia.nextInt();
            }
			
			// Total de pessoas que gostam de futebol 
			if (esporte ==1) {
				futebol ++;
				
			}
			
			// Total de pessoas que gostam de volei e são maiores de 18 anos
			if(esporte ==2 && idade>=18) {
				voleiM18 ++;
			}
			
			// Total de pessoas que gostam de futebol e são menores de 18 anos
			if(esporte ==3 && idade<=18) {
				basquetem18 ++;
			}
			
			somaIdades += idade;
			
			totalRespostas ++;
			
			
			System.out.print("Deseja continuar (S/N) ?");
			
			  continua = leia.next().trim().toUpperCase();
	            while (!continua.equals("S") && !continua.equals("N")) {
	                System.out.print("Entrada inválida! Digite apenas S ou N: ");
	                continua = leia.next().trim().toUpperCase();
	            }
			
			
		}
		
		mediaIdades = Math.round(somaIdades/totalRespostas);
		
		System.out.printf("Total de pessoas que gostam de futebol: %d%n", futebol);
		System.out.printf("Total de pessoas que gostam de voleibol maiores de 18 anos: %d%n", voleiM18);
		System.out.printf("Total de pessoas que gostam de basquetebol menores de 18 anos: %d%n", basquetem18);
		System.out.printf("Média das idades : %.2f%n", mediaIdades);
		
		leia.close();

	}

}
