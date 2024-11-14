package HERANCA.AULA1;

public class carro extends veiculo {

    private  Integer numeroPortas;

    public carro(String marca, String modelo, Integer ano) {
        super(marca, modelo, ano);

    }
    @Override
    public String toString() {
        return "veiculo{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() +
                '}';
    }
}