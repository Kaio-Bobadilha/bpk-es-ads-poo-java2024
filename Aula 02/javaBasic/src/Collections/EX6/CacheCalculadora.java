package Collections.EX6;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheCalculadora {
    private static final int MAX_ENTRADAS = 5;
    private Map<Integer, Integer> cache = new LinkedHashMap<>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > MAX_ENTRADAS;
        }
    };

    public int calcular(int entrada) {
        if (cache.containsKey(entrada)) {
            System.out.println("Resultado obtido do cache.");
            return cache.get(entrada);
        }

        int resultado = entrada * entrada;
        cache.put(entrada, resultado);
        return resultado;
    }

    public void exibirCache() {
        System.out.println("Cache atual: " + cache);
    }

    public static void main(String[] args) {
        CacheCalculadora calculadora = new CacheCalculadora();
        calculadora.calcular(3);
        calculadora.calcular(5);
        calculadora.calcular(7);
        calculadora.calcular(3); // Deve retornar do cache
        calculadora.calcular(10);
        calculadora.calcular(15); // Expulsa a primeira entrada

        calculadora.exibirCache();
    }
}
