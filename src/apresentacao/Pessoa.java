package apresentacao;

public class Pessoa {

    private String nome;
    private int idade;

    void apresentar(){
        System.out.println("Oii! Meu nome é " + nome);
        System.out.println("E tenho " + idade + " anos");
    }

    public void setNome(String nome){ //encapsulamento
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}