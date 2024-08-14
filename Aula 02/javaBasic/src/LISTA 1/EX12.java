//Exercício 12: Ordenação de Números
//Implemente um programa que leia 5 números inteiros do usuário,
// armazene-os em um array e os imprima em ordem crescente.

package EXERCICIO.LISTA1;

import java.util.Arrays;
import java.util.Scanner;

public class EX12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nub = new int[5];

        for (int i = 0; i < nub.length; i++){
            System.out.print("Digite o numero " + (i+1) + ": ");
            nub[i] = scanner.nextInt();
        }
        Arrays.sort(nub);

        System.out.print("Os numeros na ordem crecente sao: \n");
        for (int i = 0; i < nub.length; i++){
            System.out.println((nub[i]));
        }
        scanner.close();
    }
}
