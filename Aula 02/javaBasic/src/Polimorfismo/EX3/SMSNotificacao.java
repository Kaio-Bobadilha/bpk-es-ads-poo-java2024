package Polimorfismo.EX3;

public class SMSNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS com a mensagem: " + mensagem);
    }
}