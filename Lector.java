/**
 * @author Luis Montenegro, Nikolas Gasdaglis
 * @since 14/03/22
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;
import java.io.FileReader;
import java.io.File;


public class Lector {

    /**
     * Archivo que lee e imprime el contenido del archivo
     * @throws IOException
     */
    public void leerArchivo()throws IOException{
        File file = new File("cards_desc.txt");
        BufferedReader lector = new BufferedReader(new FileReader(file.getAbsolutePath()));
        String linea = lector.readLine();
        String l;
        while((l =linea)!=null){
            System.out.println(l);
        }
        lector.close();
    }

    /**
     * Este método lee el archivo y retorna un arreglo de arreglos con los datos
     * @throws IOException
     */
    public List<String[]> leerArchivoBufferArreglo() throws IOException{
        List<String[]> lista = new LinkedList<String[]>();
        File file = new File("cards_desc.txt");
        BufferedReader lector = new BufferedReader(new FileReader(file.getAbsolutePath()));
        String linea = lector.readLine(); 
        String l;
        while((l=linea)!=null){
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
