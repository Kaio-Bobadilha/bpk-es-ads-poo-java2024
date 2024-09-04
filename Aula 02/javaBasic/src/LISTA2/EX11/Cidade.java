package EXERCICIO.LISTA2.EX11;

public class Cidade{
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado){
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade){
        if(quantidade > 0){
            populacao += quantidade;
            System.out.println(quantidade + " habitantes adicionados à população.");
        }else{
            System.out.println("Quantidade inválida para aumentar a população.");
        }
    }

    public void diminuirPopulacao(int quantidade){
        if(quantidade > 0 && quantidade <= populacao){
            populacao -= quantidade;
            System.out.println(quantidade + " habitantes removidos da população.");
        }else{
            System.out.println("Quantidade inválida para diminuir a população.");
        }
    }
}
