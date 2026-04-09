package nischal_w6;
import java.util.TreeSet;

public class Q8 {
    public static void main(String[] args) {
        
        TreeSet<String> names = new TreeSet<>();

        names.add("Nischal");
        names.add("Aarav");
        names.add("Sita");
        names.add("Ramesh");
        names.add("Priya");
        names.add("Red");   
        names.add("Red");   

        
        System.out.println("Names in alphabetical order: " + names);

        System.out.println("Iterating through names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
