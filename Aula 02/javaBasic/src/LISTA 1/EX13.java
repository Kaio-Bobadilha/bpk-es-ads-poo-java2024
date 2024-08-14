//Exercício 13: Jogo de Adivinhação
//Desenvolva um jogo de adivinhação onde o computador escolhe um número aleatório entre 1 e 100, e o usuário deve adivinhar qual é o número.
//O programa deve fornecer dicas ao usuário se o palpite for muito alto ou muito baixo e contar o número de tentativas até o acerto.

package EXERCICIO.LISTA1;

import java.util.Random;
import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Escolhe um número aleatório entre 1 e 100
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        // Loop para o jogo até que o usuário acerte o número
        while (palpite != numeroSorteado) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            // Fornece dicas baseadas no palpite
            if (palpite < numeroSorteado) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSorteado) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}
