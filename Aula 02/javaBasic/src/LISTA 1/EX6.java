package EXERCICIO.LISTA1;
//Crie um programa que declare um array de inteiros com 5 elementos,
// inicialize-o com valores e imprima todos os valores do array no console.
public class EX6 {
    public static void main(String[] args){
    int[] nub = {1,2,3,4,5};

    System.out.print("As arrays são: \n");
        for (int i = 0; i < nub.length; i++){
            System.out.println("O numero é: " + nub[i]);
        }
    }
}
