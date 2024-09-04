package EXERCICIO.LISTA2.EX8;

public class Professor{
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario){
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula(){
        System.out.println(nome + " está dando aula de " + disciplina);
    }

    public void corrigirProvas(){
        System.out.println(nome + " está corrigindo provas de " + disciplina);
    }
}