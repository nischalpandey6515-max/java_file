package nischal_w6;
import java.util.Stack;

public class Q6 {
    public static void main(String[] args) {
    
        String sentence = "Hello World";

        String[] words = sentence.split(" ");

        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }

        
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
    }
}
