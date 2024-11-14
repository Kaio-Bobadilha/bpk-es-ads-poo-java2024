package EXERCICIO.LISTA4.SistemaDeGestao;

public class MainRestaurante {
    public static void main(String[] args) {

        Prato prato1 = new Prato("Pizza Margherita", "Pizza com tomate e manjericão", 35.00);
        Prato prato2 = new Prato("Lasanha", "Lasanha de carne com molho", 42.00);

        Cliente cliente1 = new Cliente("Maria", "987654321");

        Pedido pedido1 = new Pedido(cliente1);

        ItemPedido item1 = new ItemPedido(prato1, 2);
        ItemPedido item2 = new ItemPedido(prato2, 1);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        System.out.println("Valor total do pedido: " + pedido1.calcularValorTotal());
    }
}
