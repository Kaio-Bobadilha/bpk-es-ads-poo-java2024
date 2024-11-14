package Collections.EX10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaVotacao {
    private Set<String> eleitores = new HashSet<>();
    private Map<String, Integer> votos = new HashMap<>();

    public void votar(String eleitor, String candidato) {
        if (eleitores.contains(eleitor)) {
            System.out.println("Eleitor " + eleitor + " já votou!");
            return;
        }

        eleitores.add(eleitor);
        votos.put(candidato, votos.getOrDefault(candidato, 0) + 1);
        System.out.println("Voto computado para " + candidato + ".");
    }

    public void exibirResultado() {
        System.out.println("Resultado da votação:");
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " voto(s)");
        }
    }

    public static void main(String[] args) {
        SistemaVotacao sistema = new SistemaVotacao();
        Scanner scanner = new Scanner(System.in);

        String opcao;
        do {
            System.out.println("Digite o nome do eleitor:");
            String eleitor = scanner.nextLine();
            System.out.println("Digite o nome do candidato:");
            String candidato = scanner.nextLine();
            sistema.votar(eleitor, candidato);

            System.out.println("Deseja continuar votando? (s/n)");
            opcao = scanner.nextLine();
        } while (opcao.equalsIgnoreCase("s"));

        sistema.exibirResultado();
        scanner.close();
    }
}
