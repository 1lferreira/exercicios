package br.com.fescfafic.poo.Model;

public class ContaBancaria {

    public String instituicaoFinanceira;
    public String titularDeConta;
    public String agencia;
    public String conta;
    public String cpf;
    public double valor = 1000.00;

    public ContaBancaria(){}

    public void depositarDinheiro(double valorDeposito) {

        this.valor += valorDeposito;

    }

    public void retirarDinheiro(double valorRetirada) {

        this.valor -= valorRetirada;

    }

    public void acaoTransferencia(ContaBancaria conta, double valorTransferencia){

        this.retirarDinheiro(valorTransferencia);
        conta.depositarDinheiro(valorTransferencia);

    }

    public double getValor(){

        return this.valor;

    }

    public void confirmacaoConta(String agencia, String conta, String cpf){



        }

    }
