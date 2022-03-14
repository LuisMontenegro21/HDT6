import java.io.IOException;

/**
 * @author Luis Montenegro, Nikolas 
 * @since 10/03/22
 * @version 1.0
 */
public class Controlador{
  public static void main(String[] args){
    boolean terminado = false;
    String input = null;
    Vista vista;
    GetMap<String, String> mapa = new GetMap<String, String>();
    Lector lectorArchivo = new Lector();

    while(!terminado){ 
      vista = new Vista();
      vista.menu();
      input = vista.input().toLowerCase();

      if(input.equals("salir")||input.equals("4")){
        vista.finalziar();
        terminado = true;
      } 
      else{ 
        try {
          mapa.getMap(input);
          lectorArchivo.leerArchivoBuffer();
        } catch (IOException e) {
          vista.ioExceptionError();
          System.out.println(e.getCause());
        }
      }
    }



  }

}
