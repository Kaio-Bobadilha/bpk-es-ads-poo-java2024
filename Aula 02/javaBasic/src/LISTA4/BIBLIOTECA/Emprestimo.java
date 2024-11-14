package EXERCICIO.LISTA4.BIBLIOTECA;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Leitor leitor;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        livro.emprestar();
    }

    public void devolverLivro() {
        livro.devolver();
    }
}
