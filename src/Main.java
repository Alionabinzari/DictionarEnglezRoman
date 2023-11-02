import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> dictionar = new HashMap<>();

        dictionar.put("window", "geam");
        dictionar.put("door", "uşă");
        dictionar.put("dog", "câine");
        dictionar.put("cat", "pisică");
        dictionar.put("house", "casă");
        dictionar.put("sofa", "canapea");
        dictionar.put("cup", "cana");
        dictionar.put("flower", "floare");
        dictionar.put("floor", "perete");

        for (Map.Entry<String, String> entry : dictionar.entrySet()) {
            String Engleza = entry.getKey();
            String Romana = entry.getValue();
            System.out.println(Engleza + " - " + Romana);
        }

    }
}