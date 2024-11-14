package API_STEAM.EX4;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio4 {
    public static void main(String[] args) {
        Map<String, Integer> estoqueProdutos = new HashMap<>();
        estoqueProdutos.put("Laranja", 30);
        estoqueProdutos.put("Tomate", 100);
        estoqueProdutos.put("Batata", 20);
        estoqueProdutos.put("Cenoura", 60);

        Map<String, Integer> produtosFiltrados = estoqueProdutos.entrySet().stream()
                .filter(entry -> entry.getValue() < 50)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        produtosFiltrados.forEach((produto, estoque) ->
                System.out.println("Produto: " + produto + ", Estoque: " + estoque));
    }
}
