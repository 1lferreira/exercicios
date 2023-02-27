public class Main {

    public static void main (String [] args){

        String data = dataPorExtenso(18, 2, 2023);
        System.out.println(data);

        somar(15, 13, 15);

        somaImposto(18.7, 60);

    }

    private static void somar(int n1, int n2, int n3) {

        System.out.println(n1 + n2 + n3);

    }

    public static String dataPorExtenso (int dia, int mes, int ano) {

        String mesPorExtenso = "";

        switch (mes) {
            case 1:
                mesPorExtenso = "janeiro";
            case 2:
                mesPorExtenso = "fevereiro";
            case 3:
                mesPorExtenso = "março";
            case 4:
                mesPorExtenso = "abril";
            case 5:
                mesPorExtenso = "maio";
            case 6:
                mesPorExtenso = "junho";
            case 7:
                mesPorExtenso = "julho";
            case 8:
                mesPorExtenso = "agosto";
            case 9:
                mesPorExtenso = "setembro";
            case 10:
                mesPorExtenso = "outubro";
            case 11:
                mesPorExtenso = "novembro";
            case 12:
                mesPorExtenso = "dezembro";
        }
        return String.format("%d de %s de %d", dia, mesPorExtenso, ano);
    }
    public static void somaImposto (double taxaImposto, double custo) {

        double novoCusto = custo + (custo * (taxaImposto % 100));

        System.out.println("O novo custo do produto é: " + novoCusto);

    }

}


