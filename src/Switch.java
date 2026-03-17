public class Switch {
    //imprimir dia da semana, sendo 1 o domingo
    static void main(String[] args) {
        byte dia = 1;

        switch (dia){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terca-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}