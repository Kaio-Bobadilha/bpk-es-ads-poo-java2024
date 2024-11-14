package EXERCICIO.LISTA4.GestaodeTarefas;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String descricao;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public double calcularProgresso() {
        long concluidas = tarefas.stream().filter(Tarefa::isConcluida).count();
        return (double) concluidas / tarefas.size() * 100;
    }
}
