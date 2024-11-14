package EXERCICIO.LISTA4.BIBLIOTECA;

public class Livro {
    private String titulo;
    private Autor autor;
    private String ISBN;
    private int quantidadeEstoque;

    public Livro(String titulo, Autor autor, String ISBN, int quantidadeEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean disponivel() {
        return quantidadeEstoque > 0;
    }

    public void emprestar() {
        if (disponivel()) {
            quantidadeEstoque--;
        }
    }

    public void devolver() {
        quantidadeEstoque++;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor.getNome() + ", Disponível: " + quantidadeEstoque;
    }
}
