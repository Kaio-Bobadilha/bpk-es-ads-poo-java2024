package EXERCICIO.LISTA3.EX21;

public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Industrial", 5, "Branca");
        System.out.println(cozinha);
        cozinha.cozinhar();
        cozinha.limpar();

    }
}
