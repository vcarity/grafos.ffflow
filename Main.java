public class Main {

  public static void main(String[] args) throws java.lang.Exception {

    System.out.println("# Ford - Fulkerson");
    System.out.println("[START]");
    System.out.println("[LOADING] Entrada:      " + args[0]);
    System.out.println("[LOADING] Origem :      " + args[1]);
    System.out.println("[LOADING] Destino:      " + args[2]);

    ffflow ff = new ffflow();
    int fluxMax = ff.ffflow(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));

    System.out.println("[DONE]    Fluxo Máximo: " + fluxMax);

  }

}
