public class Aresta {

  public int origem;
  public int destino;
  public int capacidade;

  public Aresta (String origem, String destino, String capacidade) {

    this.origem = Integer.parseInt(origem);
    this.destino = Integer.parseInt(destino);
    this.capacidade = Integer.parseInt(capacidade);

  }

}
