package nischal_w6;
import java.util.ArrayList;
import java.util.Collections;

public class Q14{
    public static void main(String[] args) {
   
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 10, 3, 7, 15, 1);

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        int target = 7;
        int index = Collections.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
