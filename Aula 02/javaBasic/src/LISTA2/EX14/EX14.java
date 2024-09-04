package EXERCICIO.LISTA2.EX14;

public class EX14{
    public static void main(String[] args) {
        Time time = new Time("Corinthians", "Vanderlei Luxemburgo", 11);

        time.adicionarJogador();
        time.removerJogador();
        time.removerJogador(); // Remover mais do que o número atual de jogadores
    }
}
