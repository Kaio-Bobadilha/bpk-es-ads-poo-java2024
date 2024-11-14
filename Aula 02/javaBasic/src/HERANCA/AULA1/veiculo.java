package HERANCA.AULA1;

public class veiculo {

    private String marca;
    private String modelo;
    private Integer ano;

    public veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
    public void frear(){
        System.out.println("freiou");
    }
}