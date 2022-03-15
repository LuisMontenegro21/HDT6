/**
 * @author Luis Montenegro, Nikolas Gasdaglis
 * @since 14/03/22
 * @version 1.0
 */
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;


public class Lector {


    /**
     * Este método lee el archivo y retorna un arreglo de arreglos con los datos
     * @throws IOException
     */
    public List<String[]> leerArchivoBuffer() throws IOException{
        List<String[]> lista = new LinkedList<String[]>();
        Path path = Paths.get("cards_desc.txt");
        BufferedReader lector = Files.newBufferedReader(path);
        String linea = lector.readLine(); 
        while(linea!=null){
            String[] caracter = linea.split("|", 2);
            if(caracter.length >=2){
                String carta = caracter[0];
                String tipo = caracter[1];
            }
            else{
                System.out.println("Ignoring line");
            }
            lista.add(caracter);
        }
        lector.close();
        return lista;
    }
    
}
