package nischal_w6;
import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
    public static void main(String[] args) {
    	
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);
        int k = 2;

        Collections.rotate(list, k);

        System.out.println("List after rotating by " + k + " positions: " + list);
    }
}

