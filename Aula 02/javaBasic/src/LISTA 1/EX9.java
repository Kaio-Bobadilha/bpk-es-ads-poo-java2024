//Exercício 9: Calculadora Simples
//Crie um programa que funcione como uma calculadora simples.
//Ele deve oferecer ao usuário opções para somar, subtrair, multiplicar ou dividir dois números.
//Use uma estrutura switch para selecionar a operação.

package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int A = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int B = scanner.nextInt();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int calcu = scanner.nextInt();

        switch(calcu){
            case 1:
                System.out.println("Resultado: " + soma(A,B));
                break;
            case 2:
                System.out.println("Resultado: " + sub(A,B));
                break;
            case 3:
                System.out.println("Resultado: " + multi(A,B));
                break;
            case 4:
                if (B != 0) {
                    System.out.println("Resultado: " + divi(A, B));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
        scanner.close();
    }
    public static int soma(int A, int B){
        return A + B;
    }
    public static int sub(int A, int B){
        return A - B;
    }
    public static int multi(int A, int B){
        return A * B;
    }
    public static double divi(int A, int B){
        return (double) A / B;
    }
}
