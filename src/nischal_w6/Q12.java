package nischal_w6;
import java.util.Arrays;
import java.util.Collections;

public class Q12 {
    public static void main(String[] args) {
      
        Integer[] numbers = {5, 2, 9, 1, 7};

        Arrays.sort(numbers);
        System.out.println("Sorted in ascending order: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + Arrays.toString(numbers));
    }
}
