package EXERCICIO.LISTA2.EX7;

public class EX7{
    public static void main(String[] args){
            double[] notas = {8.5, 7.0, 9.0};
            Aluno aluno = new Aluno("João Silva", "123456", "Engenharia", notas);

            System.out.println("A média do aluno " + aluno.getNome() + " é: " + aluno.calcularMedia());
    }
}
