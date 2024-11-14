package Polimorfismo.EX1;

public class Circulo implements CalcularArea{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
        public double calculo(){
            double area = Math.PI * Math.pow(raio, 2);
            return Math.round(area * 100.0) / 100.0;
    }
}
