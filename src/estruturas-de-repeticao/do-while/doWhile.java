import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();

            if ( senha != 1234) {
                System.out.println("Ops, senha errada.... tente novamente.");
            }

           } while (senha != 1234);

        System.out.println("Senha correta!!");
        }
    }

