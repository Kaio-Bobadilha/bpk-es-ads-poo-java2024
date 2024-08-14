//Exercício 8: Entrada de Dados
//Escreva um programa que leia o nome e
// a idade de uma pessoa a partir do teclado e imprima uma mensagem no console com essas informações.
package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Qual a sua idade: ");
        int idade = scanner.nextInt();

        System.out.printf("O seu nome é %s%n", nome);
        System.out.printf("A sua idade é %d%n", idade);

        scanner.close();
    }
}

