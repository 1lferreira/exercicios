package atividadeEmSala.Model;

public class Animal {

    String animal;
    double altura;
    Pessoa dono;
    int idade;

    public Animal(String animal, double altura, Pessoa donoDoAnimal, int idade) {

        this.animal = animal;
        this.altura = altura;
        this.dono = donoDoAnimal;
        this.idade = idade;

    }

    public void brincar(String animal) {

        System.out.println("Você fez cosquinha no " + animal + "do/da" + this.dono);

    }

    public void alimentar(String animal) {

        System.out.println(animal + " está muito feliz!");

    }

    @Override
    public String toString() {

        return "<Animal: Animal=" + this.animal
                + ", Altura=" + this.altura
                + ", Dono=" + this.dono
                + ", Idade=" + this.idade
                + ">";

    }

}
