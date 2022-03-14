/**
 * @author Luis Montenegro, Nikolas 
 * @since 10/03/22
 * @version 1.0
 */
import java.util.Scanner;

public class Vista {
    
    private Scanner scan;

    public Vista(){
        scan = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("Ingrese qué tipo de mapa desea usar\n1 HashMap\n2 TreeMap\n3 LinkedHashMap\n4 Salir");
    }

    public void agregar(){
        System.out.println("Ingrese la carta que quiere agregar: ");
    }
    /**
     * para tomar el ingreso del usuario
     * @return string
     */
    public String input(){
        return scan.next();
    }

    public void ioExceptionError(){
        System.out.println("Error con el archivo");
    }

    public void cartaNoEncontrada(){
        System.out.println("ERROR: La carta ingresada no existe");
    }

    public void finalziar(){
        System.out.println("Programa finalizado");
    }

}
