package array;
public class ArraysNumInt {
    public static void main(String[] args) {
        int [] numeros = {10,20,30,40};
        int soma = 0;

        for(int i = 0; i <numeros.length; i++) {
            soma = soma + numeros[i];
            System.out.println(numeros[i]);
        }
        System.out.println("A soma dos numeros seria "+soma);
    }
}
