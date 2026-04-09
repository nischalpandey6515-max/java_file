package nischal_w6;
import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();

        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");

        System.out.println("Stack after pushing tasks: " + tasks);

        String removedTask = tasks.pop();
        System.out.println("Popped task: " + removedTask);

        tasks.push("Debug");
        tasks.push("Test");

        System.out.println("Stack after adding Debug and Test: " + tasks);

        String topTask = tasks.peek();
        System.out.println("Top task (peek): " + topTask);

        System.out.println("Final stack: " + tasks);
    }
}
