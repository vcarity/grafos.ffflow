import java.io.*;

public class ffflow {

  public int ffflow(String args, int origem, int destino) throws FileNotFoundException {

    Grafo grafo = new Grafo(args);
    BFS bfs = new BFS();

    int[][] grafoResidual = new int[grafo.numeroDeVertices][grafo.numeroDeVertices];
    int fluxoMaximo = 0;
    int caminhoDoFluxo = Integer.MAX_VALUE;

    for (int i = 0; i < grafo.numeroDeVertices; i++) {
      for (int j = 0; j < grafo.numeroDeVertices; j++) {
        grafoResidual[i][j] = grafo.matriz[i][j];
      }
    }

    while(bfs.buscarEmLargura(grafoResidual, origem, destino, grafo.numeroDeVertices)) {

      for (int j = destino; j != origem; j = bfs.caminho[j]) {
        int i = bfs.caminho[j];
        caminhoDoFluxo = Math.min(caminhoDoFluxo, grafoResidual[i][j]);
      }

      for (int j = destino; j != origem; j = bfs.caminho[j]) {
        //System.out.println("--");
        int i = bfs.caminho[j];
        grafoResidual[i][j] = grafoResidual[i][j] - caminhoDoFluxo;
        grafoResidual[j][i] = grafoResidual[j][i] + caminhoDoFluxo;
      }

      fluxoMaximo = fluxoMaximo + caminhoDoFluxo;

    }

    for (int i = 0; i < grafo.numeroDeArestas; i++) {
      System.out.print(0 + " ");
    }
    System.out.println();

    return fluxoMaximo;

  }

}
