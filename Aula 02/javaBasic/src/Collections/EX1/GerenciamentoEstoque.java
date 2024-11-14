package Collections.EX1;

import java.util.HashMap;
import java.util.Map;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco + ", Quantidade em estoque: " + quantidade;
    }
}

public class GerenciamentoEstoque {
    private Map<Integer, Produto> estoque = new HashMap<>();

    public void adicionarProduto(int codigo, Produto produto) {
        estoque.put(codigo, produto);
    }

    public void removerProduto(int codigo) {
        estoque.remove(codigo);
    }

    public void exibirEstoque() {
        for (Map.Entry<Integer, Produto> entry : estoque.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        GerenciamentoEstoque sistema = new GerenciamentoEstoque();
        sistema.adicionarProduto(101, new Produto("Teclado", 150.00, 10));
        sistema.adicionarProduto(102, new Produto("Mouse", 80.00, 15));

        System.out.println("Estoque atual:");
        sistema.exibirEstoque();
    }
}
