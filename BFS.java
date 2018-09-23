import java.util.*;

public class BFS {

  int[] pai;

  public boolean buscarEmLargura(int[][] grafoResidual, int origem, int destino, int numeroDeVertices) {

    this.pai = new int[numeroDeVertices];
    boolean[] verticeVisitado = new boolean[numeroDeVertices];
    LinkedList<Integer> fila = new LinkedList<Integer>();

    for (int i = 0; i < numeroDeVertices; i++) {
      verticeVisitado[i] = false;
    }

    fila.add(origem);
    verticeVisitado[origem] = true;
    pai[origem] = -1;

    while(fila.size() != 0) {

      int i = fila.poll();

      for (int j = 0; j < numeroDeVertices; j++ ) {

        if ( (verticeVisitado[j] == false) && (grafoResidual[i][j] > 0) ) {

          fila.add(j);
          pai[j] = i;
          verticeVisitado[j] = true;

        }

      }

    }

    return (verticeVisitado[destino] == true);

  }

}
