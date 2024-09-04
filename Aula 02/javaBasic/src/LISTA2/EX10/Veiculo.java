package EXERCICIO.LISTA2.EX10;

public class Veiculo{
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor){
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer(){
        System.out.println("O veículo com placa " + placa + " está sendo abastecido.");
    }

    public void lavar(){
        System.out.println("O veículo com placa " + placa + " está sendo lavado.");
    }
}
