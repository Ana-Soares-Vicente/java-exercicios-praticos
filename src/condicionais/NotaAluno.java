package condicionais;
public class NotaAluno {
    public static void main(String[] args) {
        double nota = 7.5;

        if(nota >= 7){ // || E
            System.out.println("Aprovado!!");
        }
        else if (nota >= 5) { // || OU  -  ! NEGACAO
            System.out.println("Recuperacao, estude mais...");
        } else if (nota < 5) {
            System.out.println("Reprovado.");
        }
    }
}
