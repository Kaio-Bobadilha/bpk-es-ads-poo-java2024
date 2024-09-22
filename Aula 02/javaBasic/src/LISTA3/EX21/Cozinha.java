package EXERCICIO.LISTA3.EX21;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    // Construtor
    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos
    public void cozinhar() {
        System.out.println("A cozinha está sendo usada para cozinhar.");
    }

    public void limpar() {
        System.out.println("A cozinha está sendo limpa.");
    }

    @Override
    public String toString() {
        return """
                Tipo: %s
                Quantidade de Pessoas: %d
                Cor: %s
                """.formatted(tipo, quantidadePessoas, cor);
    }
}
