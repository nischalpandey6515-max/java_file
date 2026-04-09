package nischal_w6;
import java.util.ArrayList;
import java.util.Collections;

public class Q13 {
    public static void main(String[] args) {
 
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("Original list: " + colors);

        Collections.sort(colors);
        System.out.println("Sorted in ascending order: " + colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + colors);
    }
}

