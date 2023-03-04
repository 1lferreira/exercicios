package atividadeEmSala.Model;

public class Pessoa {
    String nome;
    double altura;
    String apelido;
    double peso;
    String cpf;

    public Pessoa(String nome, double altura, String apelido, double peso, String cpf){
        this.nome = nome;
        this.altura = altura;
        this.apelido = apelido;
        this.peso = peso;
        this.cpf = cpf;
    }

    public void andar(double altura){

        double passo = altura / 2;
        System.out.println("Com 1 passo você andou " + passo + "metros.");

    }

    public void pular(double altura){

        double pulo = altura + (altura / 2);
        System.out.println("Sua impulsão é de " + pulo + "metros.");

    }

    @Override
    public String toString(){

        return "<Pessoa: Nome=" + this.nome
                + ", Altura=" + this.altura
                + ", Apelido=" + this.apelido
                + ", Peso=" + this.peso
                + ", Cpf=" + this.cpf
                + ">";

    }

}

