package EXERCICIO.LISTA2.EX1;

public class    Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 1;
    }

    public void abrirLivro(){
        this.paginaAtual = 1;
        System.out.println("Você abriu o livro '" + titulo + "' do autor " + autor + ".");
    }

    public void lerPagina(){
        if(paginaAtual <= numeroDePaginas){
            System.out.println("Você leu a página " + paginaAtual + " de " + numeroDePaginas + ".");
            paginaAtual++;
        }else{
            System.out.println("Você já leu todas as páginas.");
        }
    }

    @Override
    public String toString(){
        return "Título: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + numeroDePaginas;
    }
}
