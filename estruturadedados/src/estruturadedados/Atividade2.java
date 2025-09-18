package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        while (true) {
            // Menu 
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║    Biblioteca Conhecimento    ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ 1 - Adicionar Livro na pilha  ║");
            System.out.println("║ 2 - Listar todos os Livros    ║");
            System.out.println("║ 3 - Retirar Livro da pilha    ║");
            System.out.println("║ 0 - Sair                      ║");
            System.out.println("╚═══════════════════════════════╝");
            System.out.print("Digite uma opção: ");

            if (!leia.hasNextInt()) {
                leia.nextLine();
                System.out.println("\nOpção inválida! Digite 0, 1, 2 ou 3.");
                continue;
            }

            int opcao = leia.nextInt();
            leia.nextLine(); 

            if (opcao == 0) {
                System.out.println("\nPrograma Finalizado!");
                break;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("\nDigite o nome: ");
                    String livro = leia.nextLine().trim();
                    if (livro.isEmpty()) {
                        System.out.println("\nNome vazio! Operação cancelada.");
                        break;
                    }
                    pilha.push(livro);

                    System.out.println("\nPilha: \n");
                    for (int contador = 0; contador < pilha.size(); contador++) {
                        System.out.println(pilha.get(contador));
                    }
                    System.out.println("\nLivro adicionado!");
                }

                case 2 -> {
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        System.out.println("\nLista de Livros na Pilha:\n");
                        for (int contador = 0; contador < pilha.size(); contador++) {
                            System.out.println(pilha.get(contador));
                        }
                    }
                }

                case 3 -> {
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        String retirado = pilha.pop(); // Armazenar o livro retirado para adicionar na mensagem 
                        System.out.println("\nPilha: \n");
                        for (int contador = 0; contador < pilha.size(); contador++) {
                            System.out.println(pilha.get(contador));
                        }
                        System.out.println("\nO Livro \"" + retirado + "\" foi retirado da pilha!");
                    }
                }

                default -> System.out.println("\nOpção inválida! Digite 0, 1, 2 ou 3.");
            }
        }

        leia.close();
    }
}

