package arrayList;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int contador = 0; // se o contador era 0, faz um ++ que ele fica 1

        while(contador < 3) {
            System.out.println("Digite um nome: ");
            String nome = sc.nextLine();

            nomes.add(nome);
            contador++;

        }
            System.out.println("Lista de nomes: " + nomes);


            System.out.println("Digite um nome para remover: ");
            String remover = sc.nextLine();

            nomes.remove(remover);

            System.out.println("Lista após remover: " + nomes);



        sc.close();
    }
}
