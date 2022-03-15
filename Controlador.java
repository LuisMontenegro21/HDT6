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
        terminado = true;
      } 
      else{ 
        try {
          map = mapa.concatenar(mapa.getMap(input), lectorArchivo.leerArchivoBuffer());
          terminado = true;
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
      if(input.equals("7")||input.equals("salir")){
        vista.finalziar();
        terminado = true;
      }
      else{

      }
    }



  }

}
