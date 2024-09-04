package EXERCICIO.LISTA2.EX4;

public class EX4 {
    public static void main(String[] args){
        // Cria uma nova instância de ContaBancaria
        ContaBancaria ContaBancaria = new ContaBancaria("123456789", 100);

        System.out.println("Saldo inicial: R$" + ContaBancaria.verSaldo());

        ContaBancaria.depositar(50); // Deposita R$50
        System.out.println("Saldo após depósito: R$" + ContaBancaria.verSaldo());

        ContaBancaria.sacar(30); // Saca R$30
        System.out.println("Saldo após saque: R$" + ContaBancaria.verSaldo());

        // Tenta sacar um valor maior do que o saldo disponível
        ContaBancaria.sacar(150); // Tenta sacar R$150
    }
}
