import java.util.Scanner;
public class E4 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Quanto você ganha por hora trabalhada? R$");
    double salarioHora = scanner.nextDouble();

    System.out.print("Quantas horas você trabalha no mês?");
    int horasMes = scanner.nextInt();

    double salarioMes = salarioHora * horasMes;

    System.out.printf("Seu salário bruto é de: R$%.2f", salarioMes);

    double ir = salarioMes * 0.11;

    double inss = salarioMes * 0.08;

    double sind = salarioMes * 0.05;

    System.out.printf("\nVocê pagou de Imposto de Renda um total de: R$%.2f", ir);

    System.out.printf("\nVocê pagou para o INSS um total de: R$%.2f", inss);

    System.out.printf("\nVocê pagou para o Sindicato um total de: R$%.2f", sind);

    System.out.printf("\nVocê pagou de impostos um total de: R$%.2f", ir + inss + sind);

    double salarioLiquido = salarioMes - (ir + inss + sind);

    System.out.printf("\nSeu salário líquido é de: R$%.2f", salarioLiquido);

    }
}
