package EXERCICIO.LISTA4.AlugueldeCarros;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double valorPorDia;
    private boolean disponivel;

    public Carro(String marca, String modelo, int ano, double valorPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorPorDia = valorPorDia;
        this.disponivel = true;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValorPorDia() {
        return valorPorDia;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Carro: " + marca + " " + modelo + " (" + ano + ")";
    }
}
