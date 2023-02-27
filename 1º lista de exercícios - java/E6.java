import java.util.Scanner;
public class E6 { public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    double n1 = scanner.nextDouble();

    System.out.print("Digite um número: ");
    double n2 = scanner.nextDouble();

    System.out.print("Digite um número: ");
    double n3 = scanner.nextDouble();

    if (n1 > n2 && n1 > n3) {
        System.out.printf("O maior número é: %.0f", n1);
    } else if (n2 > n1 && n2 > n3) {
        System.out.printf("O maior número é: %.0f", n2);
    } else {
        System.out.printf("O maior númeor é: %.0f", n3);
    }

    if (n1 < n2 && n1 < n3) {
        System.out.printf("\nO menor número é: %.0f", n1);
    } else if (n2 < n1 && n2 < n3) {
        System.out.printf("\nO menor número é: %.0f", n2);
    } else {
        System.out.printf("\nO menor númeor é: %.0f", n3);
    }
    }
}
