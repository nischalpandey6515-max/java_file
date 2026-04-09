package nischal_w6;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
       
        ArrayList<String> a = new ArrayList<>();

        a.add("Nischal");
        a.add("Aarav");
        a.add("Sujal");
        a.add("Cyrus");
        a.add("Ayush");

        System.out.println("Original " + a);

        a.remove("Ayush");

        System.out.println("Updated  " + a);
    }
}
