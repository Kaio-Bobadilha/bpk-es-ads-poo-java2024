package API_STEAM.EX2;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> produtos = Arrays.asList("Eletrônicos", "Roupas", "Eletrônicos", "Livros", "Roupas", "Alimentos");

        Map<String, Long> contagemPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(produto -> produto, Collectors.counting()));

        contagemPorCategoria.forEach((categoria, contagem) ->
                System.out.println("Categoria: " + categoria + ", Ocorrências: " + contagem));
    }
}
