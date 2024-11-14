package EXERCICIO.LISTA4.GestaodeTarefas;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Usuario responsavel;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, Usuario responsavel, LocalDate dataInicio) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.dataInicio = dataInicio;
        this.concluida = false;
    }

    public void marcarConcluida() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return concluida;
    }
}
