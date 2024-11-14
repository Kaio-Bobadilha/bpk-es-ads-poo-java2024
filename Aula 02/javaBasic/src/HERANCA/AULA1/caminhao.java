package HERANCA.AULA1;

public class caminhao extends veiculo {

    private Integer NumerosdeEixos;

    public caminhao(String marca, String modelo, Integer ano, Integer NumerosdeEixos) {
        super(marca, modelo, ano);
        this.NumerosdeEixos = NumerosdeEixos; // Atribuindo o valor ao atributo
    }

    public Integer getNumerosdeEixos() {
        return NumerosdeEixos;
    }

    @Override
    public String toString() {
        return "caminhao{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", ano=" + super.getAno() +
                ", Numeros de Eixos=" + NumerosdeEixos +  // Incluindo o número de eixos no toString
                '}';
    }
}
