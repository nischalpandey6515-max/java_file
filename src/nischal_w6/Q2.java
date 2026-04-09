package nischal_w6;
import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        if (list.isEmpty()) {
            System.out.println("The linked list is currently empty.");
        }
        list.addFirst("Nischal");   
        list.addLast("Aarav");      

        System.out.println("Linked list after adding elements: " + list);

        list.addFirst("Sita");
        list.addLast("Priya");

        System.out.println("Linked list after more insertions: " + list);

        if (list.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            System.out.println("The linked list is not empty.");
        }
    }
}
