public class ArrayMaiorInt {
    public static void main(String[] args) {
        int[] numeros = {8, 20, 50, 14, 15};
        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior eh: " + maior);
    }
}