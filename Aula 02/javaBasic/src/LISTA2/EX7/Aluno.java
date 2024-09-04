package EXERCICIO.LISTA2.EX7;

public class Aluno{
    private String nome;
    private String matricula;
    private String curso;
    private double[] notas;

    public Aluno(String nome, String matricula, String curso, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getMatricula(){return matricula;}
    public void setMatricula(String matricula){this.matricula = matricula;}

    public String getCurso(){return curso;}
    public void setCurso(String curso){this.curso = curso;}

    public double[] getNotas(){return notas;}
    public void setNotas(double[] notas){this.notas = notas;}
}
