package nischal_w6;
import java.util.HashMap;
import java.util.Map;

public class Q10 {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Nischal", "9709739820");
        contacts.put("Aarav", "9814351584");
        contacts.put("Sujal", "9860555321");
        contacts.put("Anshu", "9863700960");
        contacts.put("Cyrus", "9822556688");

        // Print the entire HashMap
        System.out.println("Contacts: " + contacts);

        // Iterate through the HashMap
        System.out.println("Iterating through contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }

        // Lookup a specific contact
        String searchName = "Sita";
        if (contacts.containsKey(searchName)) {
            System.out.println(searchName + "'s phone number: " + contacts.get(searchName));
        } else {
            System.out.println(searchName + " not found in contacts.");
        }
    }
}
