package condicionais;
public class Dirigir {
     public static void main(String[] args) {
        int idade = 20;
        boolean temCarteira = true;

        if(idade >=18 && temCarteira){ // || E
            System.out.println("Pode dirigir!!");
        }
        else if (idade < 18 || !temCarteira) { // || OU  -  ! NEGACAO
            System.out.println("Não pode dirigir.");
        }
    }
}
