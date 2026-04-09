package nischal_w6;
import java.util.LinkedList;
import java.util.Collections;

public class Q4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original list of colors:");
        for (String color : colors) {
            System.out.println(color);
        }
        
        if (colors.contains("Red")) {
            System.out.println("\"Red\" exists in the linked list.");
        } else {
            System.out.println("\"Red\" does not exist in the linked list.");
        }

        Collections.shuffle(colors);
        System.out.println("List after shuffling: " + colors);

        Collections.sort(colors);
        System.out.println("List in ascending order: " + colors);
    }
}
