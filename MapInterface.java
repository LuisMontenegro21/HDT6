import java.util.Map;
import java.util.List;

public interface MapInterface <K,V> {

    public Map<String,String> getMap(String tipo);

    public Map<String,String> concatenar(Map<String,String> mapa, List<String[]> lista);

    public Map<String,String> addCard(Map<String, String> mapa, String carta);

}
