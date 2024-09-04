package EXERCICIO.LISTA2.EX20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta modelo " + modelo + " da marca " + marca + ".");
    }

    public void frear() {
        System.out.println("A bicicleta modelo " + modelo + " da marca " + marca + " está freando.");
    }
}
