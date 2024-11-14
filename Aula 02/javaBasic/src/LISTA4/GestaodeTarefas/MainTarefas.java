package EXERCICIO.LISTA4.GestaodeTarefas;

import java.time.LocalDate;

public class MainTarefas {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Carlos", "carlos@email.com");

        Tarefa tarefa1 = new Tarefa("Criar banco de dados", "Montar a estrutura do banco", usuario1, LocalDate.now());
        Tarefa tarefa2 = new Tarefa("Desenvolver interface", "Criar UI para o sistema", usuario1, LocalDate.now());

        Projeto projeto1 = new Projeto("Sistema de Gestão", "Desenvolvimento completo do sistema");

        projeto1.adicionarTarefa(tarefa1);
        projeto1.adicionarTarefa(tarefa2);

        tarefa1.marcarConcluida();

        System.out.println("Progresso do projeto: " + projeto1.calcularProgresso() + "%");
    }
}
