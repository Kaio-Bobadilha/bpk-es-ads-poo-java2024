package EXERCICIO.LISTA4.SistemaDeGestao;

public class Prato {
    private String nome;
    private String descricao;
    private double preco;

    public Prato(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}