public class Main {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500);
        conta.sacar(100);
        conta.depositar(200);

        System.out.println("Saldo: " + conta.getSaldo());

    }

}