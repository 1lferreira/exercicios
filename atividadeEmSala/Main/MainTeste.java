package atividadeEmSala.Main;
import atividadeEmSala.Model.Pessoa;
import atividadeEmSala.Model.Veiculo;
import atividadeEmSala.Model.Animal;
import atividadeEmSala.Model.Casa;

public class MainTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(
                "Luís",
                1.80,
                "Luís",
                65.5,
                "758942");

        Pessoa pessoa2 = new Pessoa(
                "Lucas",
                1.65,
                "Luquinhas",
                60.0,
                "574805");

        Pessoa pessoa3 = new Pessoa(
                "Maria",
                1.55,
                "Mariazinha",
                55.7,
                "647895");


        Veiculo veiculo1 = new Veiculo(
                pessoa1,
                "Onix",
                1.25,
                "abc1231");

        Veiculo veiculo2 = new Veiculo(
                pessoa2,
                "Celta",
                1.05,
                "abc1232");

        Veiculo veiculo3 = new Veiculo(
                pessoa3,
                "Prisma",
                1.5,
                "abc1233");

        Veiculo veiculo4 = new Veiculo(
                pessoa1,
                "Cruze",
                1.56,
                "abc1234");

        Veiculo veiculo5 = new Veiculo(
                pessoa1,
                "Spin",
                2.10,
                "abc125");


        Animal animal1 = new Animal(
                "Cachorro",
                1.10,
                pessoa1,
                7);

        Animal animal2 = new Animal(
                "Gato",
                0.75,
                pessoa3,
                3);

        Pessoa[] listaDePessoas = new Pessoa[3];
        listaDePessoas[0] = pessoa1;
        listaDePessoas[1] = pessoa2;
        listaDePessoas[2] = pessoa3;

        Veiculo[] listaDeVeiculos = new Veiculo[5];
        listaDeVeiculos[0] = veiculo1;
        listaDeVeiculos[1] = veiculo2;
        listaDeVeiculos[2] = veiculo3;
        listaDeVeiculos[3] = veiculo4;
        listaDeVeiculos[4] = veiculo5;

        Animal[] listaDeAnimais = new Animal[2];
        listaDeAnimais[0] = animal1;
        listaDeAnimais[1] = animal2;

        Casa casa = new Casa(listaDePessoas, listaDeVeiculos, listaDeAnimais);

        casa.imprimir(listaDePessoas);
        casa.imprimir(listaDeVeiculos);
        casa.imprimir(listaDeAnimais);

        }
    }
