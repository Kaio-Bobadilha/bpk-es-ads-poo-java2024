//Exercício 16: Conversor de Temperatura
//Desenvolva um programa que converta temperaturas entre Celsius e Fahrenheit.
// O usuário deve escolher qual conversão deseja realizar e inserir o valor da temperatura a ser convertida.

package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a Conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("Digite a opção( 1 ou 2 ): ");
        int opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.print("Digite a Temperatura em CELSIUS: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " Graus Celsius é igual a " + fahrenheit + " graus Fahrenheit ");
        }else if(opcao == 2){
            System.out.print("Digite a Temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit + 32) * 5 / 9;
            System.out.println(fahrenheit + " Graus Fahrenheit é igual a " + celsius + " graus Celsius");
        }else{
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
        scanner.close();
    }
}
