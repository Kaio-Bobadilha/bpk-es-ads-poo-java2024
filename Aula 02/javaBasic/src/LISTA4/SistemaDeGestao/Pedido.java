package EXERCICIO.LISTA4.SistemaDeGestao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private LocalDate data;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(ItemPedido::calcularValor).sum();
    }
}
