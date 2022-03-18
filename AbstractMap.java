/**
 * @author Luis Montenegro, Nikolas Gasdaglis
 * @since 14/03/22
 * @version 1.0
 */
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public abstract class AbstractMap<K, V> implements MapInterface<K,V> {

    private Object[] nuevoArreglo;

    public Map<String,String> addCard(Map<String, String> mapa, String carta){
        Map<String, String> map;
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

    public void printInOrder(Map<String,String> mapa){
        nuevoArreglo = mapa.entrySet().toArray();
        Arrays.sort(nuevoArreglo, Collections.reverseOrder());
        System.out.println(Arrays.toString(nuevoArreglo));
    }
  
    public void print(Map<String,String> mapa){
        nuevoArreglo = mapa.entrySet().toArray();
        System.out.println(Arrays.toString(nuevoArreglo));
    }


    public void showType(Map<String,String> mapa, String carta){
        nuevoArreglo = mapa.entrySet().toArray();
        
    }

}
