package EXERCICIO.LISTA2.EX5;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    // Construtor
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Método latir
    public void latir() {
        System.out.println("O Cachorro " + nome + " da RAÇA " + raca + " com a idade " + idade + " latia.");
    }

    // Método correr
    public void correr() {
        System.out.println("O Cachorro " + nome + " da RAÇA " + raca + " com a idade " + idade + " começou a correr.");
    }
}