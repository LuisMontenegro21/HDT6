
import java.util.Map;
import java.util.List;
public abstract class AbstractMap<K, V> {

    public abstract Map<String,String> getMap(String tipo);

    public void concatenar(Map<String,String> mapa, List<String[]> lista){
        if(lista.isEmpty()==false){
            for(String[] arreglo : lista){

            }
        }
        else{
            System.out.println("La lista está vacía");
        }
        
    }

}
