package EXERCICIO.LISTA4.AlugueldeCarros;

import java.time.LocalDate;

public class MainAluguel {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, 150);
        Carro carro2 = new Carro("Honda", "Civic", 2019, 120);

        Cliente cliente1 = new Cliente("Alice", "12345678900", "ABC1234");

        Locacao locacao = new Locacao(LocalDate.now(), LocalDate.now().plusDays(5), cliente1, carro1);

        System.out.println(locacao);

        locacao.finalizarLocacao();

        System.out.println("Carro disponível: " + carro1.isDisponivel());
    }
}
