package EXERCICIO.LISTA2.EX5;

import java.util.Scanner;

public class EX5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o NOME do seu Cachorro: ");
        String nome = scanner.nextLine();

        System.out.println("Qual é a RAÇA do seu Cachorro: ");
        String raca = scanner.nextLine();

        System.out.println("Qual a IDADE do seu Cachorro: ");
        int idade = scanner.nextInt();

        Cachorro cachorro = new Cachorro(nome, raca, idade);

        System.out.println("-- Selecione uma OPÇÃO --");
        System.out.println("1 - Pedir para seu Cachorro LATIR.");
        System.out.println("2 - Pedir para seu Cachorro CORRER.");

        int escolha = scanner.nextInt();

        if(escolha == 1){
            cachorro.latir();
        }else if(escolha == 2){
            cachorro.correr();
        }else{
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}