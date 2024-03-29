import java.util.Map;
import java.util.List;

public interface MapInterface <K,V> {

    public abstract Map<String,String> getMap(String tipo);

    public abstract Map<String,String> concatenar(Map<String,String> mapa, List<String[]> lista);

    public abstract Map<String,String> addCard(Map<String, String> mapa, String carta);

    public void showType(Map<String,String> mapa,String carta);

    public void print(Map<String,String> mapa);

    public void printInOrder(Map<String,String> mapa);





    

}
