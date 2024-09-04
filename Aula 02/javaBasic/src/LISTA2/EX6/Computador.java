package EXERCICIO.LISTA2.EX6;

public class Computador{
    private int processador;
    private int memoriaRam;
    private int armazenamento;  // Melhor nome para o atributo
    private boolean ligado;      // Melhor nome para o atributo

    public Computador(int processador, int memoriaRam, int armazenamento){
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.ligado = false;  // Inicia como desligado
    }

    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("O PC está ligando");
        }else{
            System.out.println("O PC já está ligado");
        }
    }

    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("O PC está desligado");
        }else{
            System.out.println("O PC já está desligado");
        }
    }
}