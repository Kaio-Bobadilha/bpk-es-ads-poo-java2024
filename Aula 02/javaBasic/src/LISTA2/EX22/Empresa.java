package EXERCICIO.LISTA2.EX22;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar() {
        numeroFuncionarios++;
        System.out.println("Um funcionário foi contratado. Número total de funcionários: " + numeroFuncionarios);
    }

    public void demitir() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido. Número total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
}
