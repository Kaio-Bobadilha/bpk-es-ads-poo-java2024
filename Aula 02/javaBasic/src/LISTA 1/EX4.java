package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Processa os dados digitados pelo usuario e armazernar
        System.out.print("Digite um numero: ");
        int nub1 = scanner.nextInt();

        if(nub1 % 2 == 0){
            System.out.println("É PAR");
        }else{
            System.out.println("É IMPAR");
        }
        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
}
