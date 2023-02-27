import java.util.Scanner;
public class E1 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a sua primeira nota: ");
    double nota1 = scanner.nextDouble();

    System.out.print("Digite a sua segunda nota: ");
    double nota2 = scanner.nextDouble();

    System.out.print("Digite a sua terceira nota: ");
    double nota3 = scanner.nextDouble();

    System.out.print("Digite a sua quarta nota: ");
    double nota4 = scanner.nextDouble();

    double media = (nota1 + nota2 + nota3 + nota4) / 4;

    System.out.printf("A sua média é de: %.1f", media);

    }
}
