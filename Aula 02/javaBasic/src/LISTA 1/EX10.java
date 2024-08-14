//Exercício 10: Número Primo
//Escreva um programa que determine se um
//número fornecido pelo usuário é primo. Um número primo é aquele que só é divisível por 1 e por ele mesmo.
package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if(ehPrimo(numero)){
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        scanner.close();
    }
    // Método para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        // Números menores que 2 não são primos
        if (num < 2){
            return false;
        }

        // Verifica divisibilidade de 2 até a raiz quadrada de num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se divisível por algum número, não é primo
            }
        }
        return true; // Se não encontrou divisores, é primo
    }
}

