/**
 * @author Luis Montenegro, Nikolas Gasdaglis
 * @since 14/03/22
 * @version 1.0
 */
import java.util.Scanner;

public class Vista {

    private Scanner scan;

    public Vista(){
        scan = new Scanner(System.in);
    }

    public void menu(int seleccion){
        if(seleccion==1){
            System.out.println("Ingrese qué tipo de mapa desea usar\n1 HashMap\n2 TreeMap\n3 LinkedHashMap\n4 Salir");
        }
        else if(seleccion==2){
            System.out.println("Ingrese el índice de la opción que desea realizar\n1 Agregar carta\n2 Mostrat tipo\n3 Mostrar coleccion" + 
            "\n4 Mostrar colección ordenada por tipo\n5 Mostrar cartas existentes\n6 Mostrar cartas existentes ordenadas por tipo\n7 salir");
        }
        
    }

    public void agregar(){
        System.out.println("Ingrese la carta que quiere agregar: ");
    }

    public void errorInput(){
        System.out.println("Ingrese una opción permitida");
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
