package br.com.fescfafic.poo.Main;
import br.com.fescfafic.poo.Model.ContaBancaria;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContaBancaria[] listaDeContas = new ContaBancaria[2];
        Scanner scan = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();

        System.out.print("Digite qual a sua instituição financeira: ");
        conta1.instituicaoFinanceira =  scan.nextLine();
        System.out.println();

        System.out.print("Digite o nome completo do titular da conta: ");
        conta1.titularDeConta = scan.nextLine();
        System.out.println();

        System.out.print("Digite o número da agência: ");
        conta1.agencia = scan.nextLine();
        System.out.println();

        System.out.print("Digite o número referente a conta: ");
        conta1.conta = scan.nextLine();
        System.out.println();

        System.out.print("Digite o número do CPF do titular da conta: ");
        conta1.cpf = scan.nextLine();
        System.out.println();


        ContaBancaria conta2 = new ContaBancaria();

        System.out.print("Digite qual a sua instituição financeira: ");
        conta2.instituicaoFinanceira =  scan.nextLine();
        System.out.println();

        System.out.print("Digite o nome completo do titular da conta: ");
        conta2.titularDeConta = scan.nextLine();
        System.out.println();

        System.out.print("Digite o número da agência: ");
        conta2.agencia = scan.nextLine();
        System.out.println();

        System.out.print("Digite o número referente a conta: ");
        conta2.conta = scan.nextLine();
        System.out.println();

        System.out.print("Digite o número do CPF do titular da conta: ");
        conta2.cpf = scan.nextLine();
        System.out.println();

        listaDeContas[0] = conta1;
        listaDeContas[1] = conta2;

        System.out.println();
        String search = scan.nextLine();


    }

}
