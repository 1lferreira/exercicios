import java.util.Scanner;
public class E7 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número que deseja conferir a tabuada de 0 a 10: ");
    int n = scanner.nextInt();

    for (int i = 0; i <= 10; i++){
        System.out.println(n + "x" + i + "=" + n*i);
    }
}
}
