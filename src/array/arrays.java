package array;
public class arrays {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {

            soma = soma + numeros[i];
            System.out.println(numeros[i]);
        }
        System.out.println("A soma dos numeros seria: "+soma);
    }
    }