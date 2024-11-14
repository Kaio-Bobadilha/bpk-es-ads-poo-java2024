package EXERCICIO.LISTA4.BIBLIOTECA;

import java.time.LocalDate;

public class MainBiblioteca {
    public static void main(String[] args) {
        Autor autor1 = new Autor("George Orwell", "Britânico");

        Livro livro1 = new Livro("1984", autor1, "123-456789", 3);

        Leitor leitor1 = new Leitor("João Silva", "2022001", "1990-05-20");

        System.out.println("Livro disponível: " + livro1.disponivel());

        Emprestimo emprestimo = new Emprestimo(livro1, leitor1, LocalDate.now(), LocalDate.now().plusDays(7));

        System.out.println("Livro disponível após empréstimo: " + livro1.disponivel());

        emprestimo.devolverLivro();
        System.out.println("Livro devolvido. Disponível: " + livro1.disponivel());
    }
}
