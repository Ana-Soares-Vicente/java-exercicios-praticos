package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistp1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();

    for(int i = 0; i < 5; i++){
      System.out.println("Digite um numero:");
      int n = sc.nextInt();
      numeros.add(n);
    }

    System.out.println("Numeros maiores que 10:");

    for(Integer num : numeros){
      if(num > 10){
        System.out.println(num);
      }
    }

  }
}