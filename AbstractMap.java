/**
 * @author Luis Montenegro, Nikolas Gasdaglis
 * @since 14/03/22
 * @version 1.0
 */
import java.util.Map;
import java.util.List;
public abstract class AbstractMap<K, V> implements MapInterface<K,V> {

    public Map<String,String> addCard(Map<String, String> mapa, String carta){
        return null;
    }

    public Map<String,String> concatenar(Map<String,String> mapa, List<String[]> lista){
        if(lista.isEmpty()==false){
            for(String[] arreglo : lista){
                for(String caracter : arreglo){
                    mapa.put(arreglo[0], arreglo[1]);
                }
            }
            return mapa;
        }
        else{
            System.out.println("La lista está vacía");
            return null;
        }
        
    }

}
