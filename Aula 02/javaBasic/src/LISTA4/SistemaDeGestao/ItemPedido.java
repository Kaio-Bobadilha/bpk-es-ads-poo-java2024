package EXERCICIO.LISTA4.SistemaDeGestao;

public class ItemPedido {
    private Prato prato;
    private int quantidade;

    public ItemPedido(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public double calcularValor() {
        return prato.getPreco() * quantidade;
    }
}
