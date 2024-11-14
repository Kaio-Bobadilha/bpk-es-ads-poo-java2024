package HERANCA.EX.AT2;

public class Veiculo {
    protected String marca;
    protected int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O veículo está ligado.");
    }
}