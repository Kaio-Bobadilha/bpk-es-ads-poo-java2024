package HERANCA.EX.AT2;

public class Carro extends Veiculo {

    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}