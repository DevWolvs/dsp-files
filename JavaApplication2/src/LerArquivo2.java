
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class LerArquivo2 {
    public static void main(String...args) throws FileNotFoundException, IOException {
        InputStream inputStream = System.in;
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Digite alguma coisa");
        String line = br.readLine();
       
        while(line != null) {
            System.out.println(line+"\r\n");
            System.out.println("Digite alguma coisa");
            line = br.readLine();
        }
    }
}
