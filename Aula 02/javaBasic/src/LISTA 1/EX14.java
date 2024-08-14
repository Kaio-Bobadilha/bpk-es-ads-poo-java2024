//Exercício 14: Contagem de Vogais
//Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contagemVogais = contarVogais(frase);

        System.out.println("Número total de vogais: " + contagemVogais);
        scanner.close();
    }

    // Método para contar o número de vogais em uma string
    public static int contarVogais(String frase) {
        int contagem = 0;
        // Converte a string para minúsculas para facilitar a comparação
        String fraseLowerCase = frase.toLowerCase();

        for (int i = 0; i < fraseLowerCase.length(); i++) {
            char c = fraseLowerCase.charAt(i);
            // Verifica se o caractere é uma vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contagem++;
            }
        }
        return contagem;
    }
}

