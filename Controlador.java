import java.io.IOException;
import java.util.Map;

/**
 * @author Luis Montenegro, Nikolas Gasdaglis
 * @since 14/03/22
 * @version 1.0
 */
public class Controlador{
  public static void main(String[] args){
    boolean terminado = false;
    String input = null;
    Vista vista;
    GetMap<String, String> mapa = new GetMap<String, String>();
    Map<String,String> map;
    Lector lectorArchivo = new Lector();

    while(!terminado){ 
      vista = new Vista();
      vista.menu(1);
      input = vista.input().toLowerCase();

      if(input.equals("salir")||input.equals("4")){
        vista.finalziar();
        System.exit(0);
      } 
      /** 
      else if(input.equals("2")){
        try {
          lectorArchivo.leerArchivo();
        } catch (IOException e) {
          vista.ioExceptionError();
        }
        
      }
      */
     
      else{ 
        
        
        try {
          map = mapa.concatenar(mapa.getMap(input), lectorArchivo.leerArchivoBufferArreglo());
          if(map==null){
            System.out.println("El mapa está vacío");
          }
          else{
            terminado = true;
          }
          
        } 
        catch (IOException e) {
          vista.ioExceptionError();
          System.out.println(e.getCause());
        }
        
      }
    }
 
    terminado = false;

    while(!terminado){
      vista = new Vista();
      vista.menu(2);
      input = vista.input();
      switch(input){
        case "1":
        break;
        case "2":
        break;
        case "3":
        break;
        case "4":
        break;
        case "5":
        break;
        case "6":
        break;
        case "7":
        vista.finalziar();
        terminado = true;
        break;
        default:
        vista.errorInput();
        break;
      }
      
    }

  }

}
