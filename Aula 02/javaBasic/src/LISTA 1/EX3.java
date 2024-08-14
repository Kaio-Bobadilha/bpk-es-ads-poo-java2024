package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Processa os dados digitados pelo usuario e armazernar
        System.out.print("Digite o primeiro numero: ");
        int nub1 = scanner.nextInt(); // Pega o resultado que o usuario colocou e coloca em alguma variavel
        System.out.print("Digite o segundo numero: ");
        int nub2 = scanner.nextInt();

        int somar = somar(nub1, nub2);
        int subtracao = subtrair(nub1, nub2);
        int multiplicacao = multiplicar(nub1, nub2);
        double divisao = divisao(nub1, nub2);

        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    }

        public static int somar(int nub1, int nub2){
            return nub1 + nub2;
        }
        public static int subtrair(int nub1, int nub2){
            return nub1 - nub2;
        }
        public static int multiplicar(int nub1, int nub2){
            return nub1 * nub2;
        }
        public static double divisao(int nub1, int nub2){
            if(nub2 != 0){
                return (double) nub1 / nub2;
            }else{
                System.out.println("Divisão por zero não permitida");
                return 0;
            }
        }
    }