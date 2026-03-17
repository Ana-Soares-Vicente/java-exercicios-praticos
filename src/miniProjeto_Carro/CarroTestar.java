package miniProjeto_Carro;

public class CarroTestar {
    public static void main(String [] args) {
        Carro c1 = new Carro();
        
        c1.nome = "uno";
        c1.marca = "fiat";
        c1.ano = 2015;
        c1.vel = 60;

        c1.acelerar(10); //se estava 60, vai aumentar pra 70

        System.out.println("Velocidade: " + c1.vel + "km/h");

        c1.freiar(30); //se estava 60, vai reduzir pra 40

        System.out.println("Velocidade: " + c1.vel + "km/h");
    }
}
