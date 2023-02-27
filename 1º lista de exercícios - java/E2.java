import java.util.Scanner;
public class E2 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quanto você ganha por hora trabalhada? R$");
    double salarioHora = scanner.nextDouble();

    System.out.print("Quantas horas você trabalha no mês?");
    int horasMes = scanner.nextInt();

    double salarioMes = salarioHora * horasMes;

    System.out.printf("Você receberá ao final deste mês: R$%.2f", salarioMes);

    }
}
