package EXERCICIO.LISTA2.EX2;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private boolean ligado;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.ligado = false; // O celular começa desligado
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O celular está ligado.");
        } else {
            System.out.println("O celular já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O celular está desligado.");
        } else {
            System.out.println("O celular já está desligado.");
        }
    }
}
