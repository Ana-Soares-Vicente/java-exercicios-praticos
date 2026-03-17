package miniProjeto_Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n1 - Cadastrar funcionario");
            System.out.println("2 - Listar Funcionarios");
            System.out.println("3 - Remover Funcionario");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                Funcionarios f = new Funcionarios();

                System.out.print("Digite o nome: ");
                f.nome = sc.nextLine();

                System.out.print("Digite o salario: ");
                f.salario = sc.nextDouble();
                sc.nextLine();

                funcionarios.add(f);
                System.out.println("Funcionario cadastrado!");
                
            } else if (opcao == 2) {
                System.out.println("\nFuncionarios cadastrados:");

                if (funcionarios.isEmpty()) {
                    System.out.println("Nenhum funcionario cadastrado.");
                } else {
                    for (Funcionarios f : funcionarios) {
                        System.out.println("Nome: " + f.nome + " | Salario: " + f.salario);
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o nome do funcionario para remover: ");
                String nomeRemover = sc.nextLine();

                boolean removido = funcionarios.removeIf(f -> f.nome.equals(nomeRemover));

                if (removido) {
                    System.out.println("Funcionario removido!");
                } else {
                    System.out.println("Funcionario nao encontrado.");
                }

            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opcao invalida!");
            }
        }

        sc.close();
    }
}