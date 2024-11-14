package Polimorfismo.EX1;

public class Retangulo implements CalcularArea{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
        public double calculo(){
            return largura * altura;
    }
}
