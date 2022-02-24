import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] lines = new String[] {"good morning","good afternoon","good night"};

        String path = "C:\\Users\\User\\Desktop\\java\\filewritter,bufferedwritter\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines) { //para cada string line contido no vetor lines
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
