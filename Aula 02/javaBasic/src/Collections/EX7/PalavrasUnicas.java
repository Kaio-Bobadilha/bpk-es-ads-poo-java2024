package Collections.EX7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalavrasUnicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String texto = scanner.nextLine();

        String[] palavras = texto.toLowerCase().split("\\W+");
        Set<String> palavrasUnicas = new HashSet<>();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                palavrasUnicas.add(palavra);
            }
        }

        System.out.println("Palavras únicas:");
        for (String palavra : palavrasUnicas) {
            System.out.println(palavra);
        }

        scanner.close();
    }
}
