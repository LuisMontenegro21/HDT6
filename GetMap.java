/**
 * @author Luis Montenegro, Nikolas 
 * @since 10/03/22
 * @version 1.0
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class GetMap<K, V> {

    public Map<String, String> getMap(String tipo){
        if(tipo.equals("hashmap")||tipo.equals("1")){
            return new HashMap<String, String>();
        }
        else if(tipo.equals("treemap")||tipo.equals("2")){
            return new TreeMap<String, String>();
        }
        else if(tipo.equals("linkedhashmap")||tipo.equals("3")){
            return new LinkedHashMap<String, String>();
        }
        else{
            return null;
        }
    }

    
}
