package Polimorfismo.EX1;

public class main {
    public static void main(String[] args) {

        CalcularArea circulo = new Circulo(5);
            System.out.println("Área do Círculo: " + circulo.calculo());

        CalcularArea Retangulo = new Retangulo(5,10);
            System.out.println("Área do Retangulo: " + Retangulo.calculo());
    }
}
