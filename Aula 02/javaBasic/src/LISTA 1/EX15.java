//Exercício 15: Fatorial
//Crie um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
// Utilize tanto a versão iterativa quanto a versão recursiva.

package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("O fatorial não está definido para números negativos.");
        }else{
            long fatorialIterativo = calcularFI(numero);
            System.out.println("Fatorial (iterativo) de " + numero + " é: " + fatorialIterativo);

            long fatorialRecursivo = calcularFR(numero);
            System.out.println("Fatorial (recursivo) de " + numero + " é: " + fatorialRecursivo);
        }
        scanner.close();
    }

    // Método para calcular o fatorial de forma iterativa
    public static long calcularFI(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular o fatorial de forma recursiva
    public static long calcularFR(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base: 0! = 1 e 1! = 1
        } else {
            return n * calcularFR(n - 1); // Chamada recursiva
        }
    }
}
