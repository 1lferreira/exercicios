import java.util.Scanner;
public class E5 { public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota 1: ");
    double n1 = scanner.nextDouble();

    System.out.print("Digite a nota 2: ");
    double n2 = scanner.nextDouble();

    double soma = n1 + n2;
    double media = soma / 2;

    if (media >= 7) {
        System.out.print("Você foi aprovado!");
    } else{
        System.out.print("Você foi reprovado.");
    }
    }
}
