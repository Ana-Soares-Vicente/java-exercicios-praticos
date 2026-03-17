public class ContaBancaria {

    private String titular;
    private double saldo;

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

}