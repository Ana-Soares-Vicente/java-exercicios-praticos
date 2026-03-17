public class Cartaop1 implements Pagamentop1{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de " + valor + " realizado via Cartao");
    }
}
