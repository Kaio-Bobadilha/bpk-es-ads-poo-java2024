package Collections.EX9;

import java.util.LinkedList;
import java.util.Queue;

class Grafo {
    private int vertices;
    private LinkedList<Integer>[] adjacencias;

    @SuppressWarnings("unchecked")
    public Grafo(int vertices) {
        this.vertices = vertices;
        adjacencias = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencias[i] = new LinkedList<>();
        }
    }

    public void adicionarAresta(int origem, int destino) {
        adjacencias[origem].add(destino);
    }

    public void buscaEmLargura(int inicio) {
        boolean[] visitado = new boolean[vertices];
        Queue<Integer> fila = new LinkedList<>();
        visitado[inicio] = true;
        fila.add(inicio);

        while (!fila.isEmpty()) {
            int no = fila.poll();
            System.out.print(no + " ");

            for (int vizinho : adjacencias[no]) {
                if (!visitado[vizinho]) {
                    visitado[vizinho] = true;
                    fila.add(vizinho);
                }
            }
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);
        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 4);

        System.out.println("Busca em Largura iniciada do nó 0:");
        grafo.buscaEmLargura(0);
    }
}
