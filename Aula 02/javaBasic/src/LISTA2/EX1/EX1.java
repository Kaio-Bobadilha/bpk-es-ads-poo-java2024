package EXERCICIO.LISTA2.EX1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o nome do livro que deseja ver: ");
        String titulo = scanner.nextLine();

        System.out.print("Coloque o nome do Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Coloque o número de páginas do livro: ");
        int numeroDePaginas = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, numeroDePaginas);

        livro.abrirLivro();

        String continuarLendo;
        do {
            livro.lerPagina();
            System.out.print("Deseja continuar lendo? (sim/não): ");
            continuarLendo = scanner.next();
        } while (continuarLendo.equalsIgnoreCase("sim"));

        scanner.close();
    }
}
