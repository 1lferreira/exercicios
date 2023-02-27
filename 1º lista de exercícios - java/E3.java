import java.util.Scanner;
public class E3 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em graus Fahrenheit: ");
    double tempF = scanner.nextDouble();

    double tempC = 5 * ((tempF - 32) / 9);

    System.out.printf("A temperatura referida, em Celsius, é: %.1f", tempC);

    }
}
