package EXERCICIO.LISTA2.EX22;

public class EX22{
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90", 50);

        empresa.contratar();
        empresa.demitir();
        empresa.demitir(); // Tentativa de demitir mais funcionários do que o número disponível
    }
}
