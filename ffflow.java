import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedList;

public class ffflow {

  public static void main(String[] args) throws FileNotFoundException, java.lang.Exception {
    
    File entrada = new File(args[0]);
    Scanner scanner = new Scanner(entrada);

    while (scanner.hasNextLine()) {
      String linha = scanner.nextLine();
      System.out.println(linha);
    }

  }

}
