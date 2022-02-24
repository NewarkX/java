import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Instancia do objeto do tipo file,
        //esse objeto  encapsula todo processo de acessar o arquivo can read,can write,etc
        //e tambem o caminho desse arquivo
        File file = new File("C:\\Users\\User\\Desktop\\java\\arquivo\\texto");
        Scanner sc = null;
        try{
            //quando scanner é instanciado ele tentara abrir o arquivo
            //nesse momento pode ser gerada uma excecao do tipo IOEcxeption
            sc = new Scanner(file);
            while(sc.hasNextLine()){ //verifica se existe umma nova linha no arquivo
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close(); //o scanner deve ser fechado
            }
        }
    }
}
    