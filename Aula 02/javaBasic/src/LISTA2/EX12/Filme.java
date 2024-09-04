package EXERCICIO.LISTA2.EX12;

public class Filme{
    private String titulo;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar(){
        System.out.println("O filme '" + titulo + "' está começando.");
    }

    public void parar(){
        System.out.println("O filme '" + titulo + "' foi parado.");
    }
}
