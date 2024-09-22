package EXERCICIO.LISTA3.EX22;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-99", 50);
        System.out.println(empresa);
        empresa.contratar();
        empresa.demitir();
    }
}
