package atividadeEmSala.Model;

public class Veiculo {

    Pessoa proprietario;
    String modelo;
    double comprimento;
    String placa;

    public Veiculo(Pessoa proprietario, String modelo, double comprimento, String placa){

        this.proprietario = proprietario;
        this.modelo = modelo;
        this.comprimento = comprimento;
        this.placa = placa;

    }

    public void verificaGaragem(double comprimento){

        if (comprimento > 2) {
            System.out.println("Cuidado! Você irá precisar tirar o seu veículo para outro entrar na garagem!");
        } else {
            System.out.println("Garagem livre, estacione onde quiser.");
        }
    }

    public void trocarVeiculo(String modelo, String placa){

        this.modelo = modelo;
        this.placa = placa;

        System.out.println("Veículo trocado.");

    }

    @Override
    public String toString() {

        return "<Veiculo: Proprietario=" + this.proprietario
                + ", Modelo=" + this.modelo
                + ", Comprimento=" + this.comprimento
                + ", Placa=" + this.placa
                + ">";
    }
}
