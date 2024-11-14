package HERANCA.AULA1;

public class moto extends veiculo{

    private TipoPartida Partida;

    public moto(String marca, String modelo, Integer ano, TipoPartida Partida){
        super(marca, modelo, ano);
        this.Partida = Partida;
    }

    public TipoPartida getPartida() {
        return Partida;
    }

    @Override
    public String toString() {
        return "moto{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() + '\'' +
                ", Partida= " + Partida +
                '}';
    }

}
