package Polimorfismo.EX3;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email com a mensagem: " + mensagem);
    }
}
