import java.io.*;
import java.util.*;

public class Grafo {

  public int numeroDeVertices = 0;
  public LinkedList<Aresta> arestas = new LinkedList<Aresta>();
  //public LinkedList<Vertice> vertices = new LinkedList<Vertice>();

  public Grafo(String args) throws FileNotFoundException {

    lerArestas(args);
    Iterator it = arestas.iterator();
    while(it.hasNext()) {
      System.out.println(it.next() + " ");
    }

  }

  public void lerArestas(String args) throws FileNotFoundException {

    File entrada = new File(args);
    Scanner scanner = new Scanner(entrada);

    while (scanner.hasNextLine()) {

      String linha = scanner.nextLine();
      String[] coluna = linha.split(" ");
      Aresta aresta = new Aresta(coluna[0], coluna[1], coluna[2]);
      arestas.add(aresta);

    }

  }

}
