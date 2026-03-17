package miniProjeto_Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livros> livros = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Remover livro");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 1) {
                Livros f = new Livros();

                System.out.println("Digite o nome do livro:");
                f.nome = sc.nextLine();

                System.out.println("Digite o autor:");
                f.autor = sc.nextLine();

                livros.add(f);

            } else if (opcao == 2) {
                System.out.println("\n📚 Livros Registrados:");

                if (livros.isEmpty()) {
                    System.out.println("Nenhum livro cadastrado.");
                } else {
                    for (Livros f : livros) {
                        System.out.println("Livro: " + f.nome + " | Autor: " + f.autor);
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Digite o nome do livro para remover:");
                String nomeRemover = sc.nextLine();

                boolean removido = livros.removeIf(f -> f.nome.equalsIgnoreCase(nomeRemover));

                if (removido) {
                    System.out.println("✅ Livro removido!");
                } else {
                    System.out.println("❌ Livro não encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}