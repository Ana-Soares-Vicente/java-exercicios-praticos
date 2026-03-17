package miniProjeto_Heranca;

public class Pombo extends Animal{
    private int cartasEnviadas;

    public Pombo(String nome){
        super(nome);
        cartasEnviadas = 10;
    }

    public void voar(){
        System.out.printf("%s voou\n", getNome());

    }

    public void fazerPru(){
        System.out.printf("%s fez pruuuuuuuuuuh\n", getNome());

    }
public void enviarCartas(){
        System.out.printf("%s enviou as cartas\n", getNome());
    cartasEnviadas++;  //= cartasEnviadas + 1;
    }

public int getCartasEnviadas() {
    return cartasEnviadas;
}
    
}
