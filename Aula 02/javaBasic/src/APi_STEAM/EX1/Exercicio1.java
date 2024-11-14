package API_STEAM.EX1;

import java.util.*;
import java.util.stream.*;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Double> pedidos = Arrays.asList(150.0, 300.0, 50.0, 400.0, 250.0);

        double valorMinimo = 100.0;

        // Filtrando pedidos acima do valor e somando
        double somaPedidosFiltrados = pedidos.stream()
                .filter(pedido -> pedido > valorMinimo)
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Total dos pedidos filtrados: " + somaPedidosFiltrados);
    }
}
