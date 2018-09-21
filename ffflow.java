import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ffflow {

  public static void main(String[] args) throws FileNotFoundException {

    File entrada = new File(args[0]);
    Scanner scanner = new Scanner(entrada);

    while (scanner.hasNextLine()) {
      String linha = scanner.nextLine();
      System.out.println(linha);
    }

  }

}
