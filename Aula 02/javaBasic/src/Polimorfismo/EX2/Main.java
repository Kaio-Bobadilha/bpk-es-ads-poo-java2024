package Polimorfismo.EX2;

import java.util.List;

public class Main {
    public static void usarFerramentas(List<Ferramenta> ferramentas) {
        for (Ferramenta ferramenta : ferramentas) {
            ferramenta.usar();
        }
    }

    public static void main(String[] args) {
        Ferramenta martelo = new Martelo();
        Ferramenta chaveDeFenda = new ChaveDeFenda();

        List<Ferramenta> listaDeFerramentas = List.of(martelo, chaveDeFenda);

        usarFerramentas(listaDeFerramentas);
    }
}
