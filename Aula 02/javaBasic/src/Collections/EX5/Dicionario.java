package Collections.EX5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dicionario {
    private Map<String, String> dicionario = new HashMap<>();

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void consultarDefinicao(String palavra) {
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            System.out.println("Definição de " + palavra + ": " + definicao);
        } else {
            System.out.println("Palavra não encontrada.");
        }
    }

    public static void main(String[] args) {
        Dicionario dic = new Dicionario();
        dic.adicionarPalavra("Java", "Uma linguagem de programação.");
        dic.adicionarPalavra("Compilador", "Programa que traduz código-fonte em código executável.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para buscar a definição:");
        String palavra = scanner.nextLine();
        dic.consultarDefinicao(palavra);
        scanner.close();
    }
}
