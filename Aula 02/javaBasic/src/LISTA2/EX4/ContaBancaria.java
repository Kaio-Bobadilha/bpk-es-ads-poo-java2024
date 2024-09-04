package EXERCICIO.LISTA2.EX4;

public class ContaBancaria{
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
        }else{
            System.out.println("Valor depositado INVALIDO");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double verSaldo(){
        return this.saldo;
    }

    public String verNumeroConta(){
        return this.numeroConta;
    }
}