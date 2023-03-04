package atividadeEmSala.Model;

public class Casa {

    Pessoa[] listaDePessoas;
    Veiculo[] listaDeVeiculos;
    Animal[] listaDeAnimais;

    public Casa(Pessoa[] listaDePessoas, Veiculo[] listaDeVeiculos, Animal[] listaDeAnimais) {

        this.listaDePessoas = listaDePessoas;
        this.listaDeVeiculos = listaDeVeiculos;
        this.listaDeAnimais = listaDeAnimais;

    }

    public void imprimir(Object[] lista) {

        for (Object i : lista) {

            System.out.println(i);

        }

    }

}
