package Collections.EX8;

import java.util.ArrayList;
import java.util.List;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarConcluida() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return descricao + (concluida ? " (Concluída)" : " (Pendente)");
    }
}

public class GerenciadorTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void listarTarefas() {
        System.out.println("Tarefas pendentes:");
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                System.out.println(tarefa);
            }
        }

        System.out.println("\nTarefas concluídas:");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                System.out.println(tarefa);
            }
        }
    }

    public void marcarConcluida(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.toString().contains(descricao)) {
                tarefa.marcarConcluida();
                break;
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa("Estudar para prova");
        gerenciador.adicionarTarefa("Comprar mantimentos");

        gerenciador.listarTarefas();
        gerenciador.marcarConcluida("Estudar para prova");

        System.out.println("\nApós marcar como concluída:");
        gerenciador.listarTarefas();
    }
}
