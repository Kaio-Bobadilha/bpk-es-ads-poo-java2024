//Exercício 11: Palíndromo
//Crie um programa que verifique se uma palavra fornecida pelo usuário
//é um palíndromo (palavra que se lê da mesma forma de trás para frente).
package EXERCICIO.LISTA1;

import java.util.Scanner;

public class EX11{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)){
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        }else{
            System.out.println("A palavra " + palavra + " não é um palíndromo.");
        }
        scanner.close();
    }
    // Método para verificar se uma palavra é um palíndromo
    public static boolean ehPalindromo(String palavra) {
        // Remove espaços em branco e converte para minúsculas para comparação
        String palavraLimpa = palavra.replaceAll("\\s+", "").toLowerCase();
        int tamanho = palavraLimpa.length();
        // Verifica se a palavra lida de trás para frente é igual à palavra original
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavraLimpa.charAt(i) != palavraLimpa.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

//palavra.replaceAll("\\s+", ""):
//
//replaceAll: É um método da classe String que substitui todas as ocorrências de um padrão específico em uma string por outro valor.
//"\\s+": É uma expressão regular que corresponde a qualquer espaço em branco (\s).
// O + indica que qualquer sequência de um ou mais espaços em branco será encontrada.
//"": É o que será usado para substituir os espaços encontrados.
// Nesse caso, estamos substituindo os espaços por nada, ou seja, estamos removendo todos os espaços da string.

//Exemplo: Se palavra fosse "A man a plan a canal Panama", a chamada replaceAll("\\s+", "") resultaria em "AmanaplanacanalPanama".
//toLowerCase():
//
//Este método converte toda a string para letras minúsculas.
//Exemplo: A string "AmanaplanacanalPanama" seria convertida para "amanaplanacanalpanama".
//Objetivo: O objetivo dessas duas operações (replaceAll e toLowerCase) é criar uma versão "limpa" da palavra,
// sem espaços em branco e sem distinção entre maiúsculas e minúsculas. Isso facilita a comparação posterior.