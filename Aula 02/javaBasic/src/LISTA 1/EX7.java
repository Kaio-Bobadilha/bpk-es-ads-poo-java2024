//Escreva um programa que contenha um método chamado soma que receba dois números inteiros como parâmetros
// e retorne a soma deles.
//Chame esse método a partir do método main e exiba o resultado.
package EXERCICIO.LISTA1;

public class EX7{
    public static void main(String[] args) {
        int resul = soma(5,10);
        System.out.println("A soma é: " + resul);
    }
    public static int soma(int A, int B){
        return A + B;
    }
}
