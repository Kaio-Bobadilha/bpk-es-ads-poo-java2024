package Collections.EX3;

import java.util.PriorityQueue;

class Paciente implements Comparable<Paciente> {
    private String nome;
    private int gravidade;

    public Paciente(String nome, int gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Paciente outro) {
        return Integer.compare(outro.gravidade, this.gravidade);
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + ", Gravidade: " + gravidade;
    }
}

public class ProntoSocorro {
    public static void main(String[] args) {
        PriorityQueue<Paciente> fila = new PriorityQueue<>();
        fila.add(new Paciente("Ana", 5));
        fila.add(new Paciente("Carlos", 8));
        fila.add(new Paciente("João", 3));

        System.out.println("Atendendo pacientes:");
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
