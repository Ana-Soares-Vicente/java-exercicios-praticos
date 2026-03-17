import java.util.Scanner;

public class calculo {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Num1 ;
        int Num2 ;

        System.out.print("Digite o primeiro número: ");
        Num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        Num2 = scan.nextInt();


        int resultadoSoma = Num1 + Num2;
        int resultadoSub = Num1 - Num2;
        int resultadoMulti = Num1 * Num2;
        int resultadoDivisao = Num1 / Num2;
        int resultadoResto = Num1 % Num2;


        System.out.println("Soma: "+ resultadoSoma);
        System.out.println("Subtração: "+ resultadoSub);
        System.out.println("Multi: "+ resultadoMulti);
        System.out.println("Divisao: "+ resultadoDivisao);
        System.out.println("Resto: "+resultadoResto);

    }
}
