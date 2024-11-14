package EXERCICIO.LISTA4.AlugueldeCarros;

public class Cliente {
    private String nome;
    private String CPF;
    private String carteiraHabilitacao;

    public Cliente(String nome, String CPF, String carteiraHabilitacao) {
        this.nome = nome;
        this.CPF = CPF;
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + ", CPF: " + CPF;
    }
}
