package API_STEAM.EX3;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio3 {
    public static void main(String[] args) {
        List<String> clientes = Arrays.asList("João", "Ana", "Carlos", "Beatriz");

        List<String> clientesTransformados = clientes.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Clientes em ordem decrescente: " + clientesTransformados);
    }
}
