
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class LerArquivo {
    public static void main(String...args) throws FileNotFoundException, IOException {
        InputStream inputStream = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        
        String line;
       
        while((line = br.readLine()) != null) {
            
        }
    }
}
