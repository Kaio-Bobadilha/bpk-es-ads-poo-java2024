package HERANCA.AULA1;

public class main {
    public static void main(String[] args) {
        carro at1 = new carro("Malda","Pt 2", 2014);
        carro at2 = new carro("Towota","Subra", 2014);

        moto biz = new moto("Honda","Biz",2015, TipoPartida.Pedal);
        moto Bmw = new moto("Bmw", "360", 2022, TipoPartida.Eletrico);

        caminhao BMW = new caminhao("BMW", "", 2022, 9);
        caminhao Scania = new caminhao("Scania", "Scania", 2015, 7);

        System.out.println(at1);
        System.out.println(at2);
        System.out.println(Bmw);
        System.out.println(biz);
        System.out.println(BMW);
        System.out.println(Scania);
    }
}
