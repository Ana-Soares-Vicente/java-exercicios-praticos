package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um nome:");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        System.out.println("Lista de nomes:");

        for(String nome : nomes){
            System.out.println(nome);
        }

    }
}