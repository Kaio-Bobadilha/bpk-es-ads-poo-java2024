package Collections.EX2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContagemDeNomes {
    public static void contarNomes(List<String> nomes) {
        Map<String, Integer> contagem = new HashMap<>();
        
        for (String nome : nomes) {
            contagem.put(nome, contagem.getOrDefault(nome, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " vez(es)");
        }
    }

    public static void main(String[] args) {
        List<String> listaDeNomes = List.of("Ana", "Carlos", "Ana", "João", "Carlos", "Ana");
        contarNomes(listaDeNomes);
    }
}
