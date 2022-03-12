/**
 * @author Luis Montenegro, Nikolas 
 * @since 10/03/22
 * @version 1.0
 */
import java.io.BufferedReader;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map;


public class Lector {
    /** 
    public void leerArchivoBuffer(Map<String,String> mapa) throws IOException{
        Path path = Paths.get("cards_desc.txt");
        BufferedReader lector = Files.newBufferedReader(path);
        String linea = lector.readLine();
    }
    */
    public void leerArchivoScanner(Map<String,String> mapa)throws IOException{
        try(final Scanner scanner = new Scanner(new File("cards_desc.txt"))){
            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                final String carta = scanner.next(), tipo = scanner.next();
                mapa.put(tipo,carta);
            }
        }
        catch (Exception e) {
            System.out.println("El archivo no existe o surgió un problema imprevisto");
            System.out.println(e.getCause());
        }
        
    }
}
