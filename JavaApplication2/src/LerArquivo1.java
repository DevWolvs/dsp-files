
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class LerArquivo1 {
    public static void main(String...args) throws FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream("arquivo.txt");
        Scanner scanner = new Scanner(inputStream);
        
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
