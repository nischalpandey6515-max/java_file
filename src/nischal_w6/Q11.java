package nischal_w6;
import java.util.HashMap;
import java.util.Map;

public class Q11 {

    public static void printMap(HashMap<String, String> map) {
        System.out.println("Country → Capital");
        map.forEach((country, capital) -> System.out.println(country + " → " + capital));
    }

    public static String getCapital(HashMap<String, String> map, String country) {
        return map.getOrDefault(country, "Not found");
    }
    public static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }

    public static void main(String[] args) {
       
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("France", "Paris");

    
        printMap(countryCapitals);

        String country = "Japan";
        System.out.println("Capital of " + country + ": " + getCapital(countryCapitals, country));
        
        String capitalCheck = "Paris";
        System.out.println("Does capital \"" + capitalCheck + "\" exist? " + containsCapital(countryCapitals, capitalCheck));

        System.out.println("\nIterating through countryCapitals:");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
