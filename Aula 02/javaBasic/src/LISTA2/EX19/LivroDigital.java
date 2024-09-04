package EXERCICIO.LISTA2.EX19;

public class LivroDigital{
    private String titulo;
    private String autor;
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo){
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrir(){
        System.out.println("O livro digital '" + titulo + "' está aberto.");
    }

    public void fechar(){
        System.out.println("O livro digital '" + titulo + "' está fechado.");
    }
}
