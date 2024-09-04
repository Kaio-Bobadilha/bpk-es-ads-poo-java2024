package EXERCICIO.LISTA2.EX11;

public class EX11{
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");

        cidade.aumentarPopulacao(50000);
        cidade.diminuirPopulacao(20000);
    }
}
