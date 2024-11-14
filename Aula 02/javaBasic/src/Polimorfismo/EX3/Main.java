package Polimorfismo.EX3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de notificação: (1) Email, (2) SMS");
        int escolha = scanner.nextInt();
        scanner.nextLine();

           System.out.println("Digite a mensagem a ser enviada:");
        String mensagem = scanner.nextLine();

        Notificacao notificacao;
        if (escolha == 1) {
            notificacao = new EmailNotificacao();
        } else if (escolha == 2) {
            notificacao = new SMSNotificacao();
        } else {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        notificacao.enviar(mensagem);

        scanner.close();
    }
}
