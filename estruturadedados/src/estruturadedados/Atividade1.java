package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        while (true) {
            // Menu bonitinho
            System.out.println("╔════════════════════════════╗");
            System.out.println("║      BANCO BOM - MENU      ║");
            System.out.println("╠════════════════════════════╣");
            System.out.println("║ 1 - Adicionar Cliente      ║");
            System.out.println("║ 2 - Listar Clientes        ║");
            System.out.println("║ 3 - Chamar Cliente         ║");
            System.out.println("║ 0 - Sair                   ║");
            System.out.println("╚════════════════════════════╝");
            System.out.print("👉 Digite uma opção: ");
            
            // Validar que foi entrada um número.
            if (!leia.hasNextInt()) {
                leia.nextLine();
                System.out.println("Opção inválida! Digite 0, 1, 2 ou 3.");
                continue;
            }

            int opcao = leia.nextInt();
            leia.nextLine(); 

            if (opcao == 0) {
                System.out.println("Programa Finalizado!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leia.nextLine().trim();
                    if (nome.isEmpty()) {
                        System.out.println("Nome vazio! Operação cancelada.");
                    } else {
                        fila.add(nome);
                        System.out.println("Cliente Adicionado!");
                    }
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        System.out.println("Lista de Clientes na Fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        String chamado = fila.poll();
                        System.out.println("O Cliente " + chamado + " foi chamado!");
                        if (fila.isEmpty()) {
                            System.out.println("Fila agora está vazia!");
                        } else {
                            System.out.println("Fila atualizada:");
                            for (String cliente : fila) {
                                System.out.println(cliente);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Digite 0, 1, 2 ou 3.");
            }
        }
        leia.close();
    }
}
