package EXERCICIO.LISTA4.AlugueldeCarros;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Cliente cliente;
    private Carro carro;

    public Locacao(LocalDate dataInicio, LocalDate dataFim, Cliente cliente, Carro carro) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.carro = carro;
        this.carro.setDisponivel(false); // Carro alugado
    }

    public double calcularValorTotal() {
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        return dias * carro.getValorPorDia();
    }

    public void finalizarLocacao() {
        carro.setDisponivel(true);  // Carro devolvido
    }

    @Override
    public String toString() {
        return "Locação: " + carro + ", Cliente: " + cliente + ", Valor Total: " + calcularValorTotal();
    }
}
