package Polimorfismo.EX2;

public class Martelo implements Ferramenta {
    @Override
    public void usar() {
        System.out.println("Usando o martelo para martelar pregos.");
    }
}
