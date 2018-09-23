import java.io.*;
import java.util.*;

public class Grafo {

  public int numeroDeVertices = 0;
  public int numeroDeArestas = 0;
  public LinkedList<Aresta> arestas = new LinkedList<Aresta>();
  public int matriz[][];

  public Grafo(String args) throws FileNotFoundException {

    lerEntrada(args);
    definirMatriz();

  }

  public void lerEntrada(String args) throws FileNotFoundException {

    File entrada = new File(args);
    Scanner scanner = new Scanner(entrada);

    while (scanner.hasNextLine()) {

      String linha = scanner.nextLine();
      String[] coluna = linha.split(" ");
      Aresta aresta = new Aresta(coluna[0], coluna[1], coluna[2]);
      arestas.add(aresta);
      if (Math.max(aresta.origem, aresta.destino) > this.numeroDeVertices) {
        this.numeroDeVertices = Math.max(aresta.origem, aresta.destino);
      }

    }

    this.numeroDeArestas = arestas.size();

  }

  public void definirMatriz() {

    this.matriz = new int[this.numeroDeVertices][this.numeroDeVertices];

    for (int i = 0; i < this.numeroDeVertices; i++) {
      for (int j = 0; j < this.numeroDeVertices; j++) {
        this.matriz[i][j] = 0;
      }
    }

    for (int k = 0; k < this.arestas.size(); k++) {
      this.matriz[arestas.get(k).origem - 1][arestas.get(k).destino - 1] = arestas.get(k).capacidade;
    }

  }

}
