package nischal_w6;
import java.util.ArrayDeque;

public class Q7 {
    public static void main(String[] args) {
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        printQueue.addLast("Document1");
        printQueue.addLast("Document2");
        printQueue.addLast("Document3");

        System.out.println("Print queue after adding jobs: " + printQueue);

        String processedJob = printQueue.pollFirst();
        System.out.println("Dequeued job: " + processedJob);

        printQueue.addLast("Document4");
        printQueue.addLast("Document5");

        System.out.println("Print queue after adding Document4 and Document5: " + printQueue);

        String nextJob = printQueue.peekFirst();
        System.out.println("Next job to be printed (peek): " + nextJob);

        
        System.out.println("Final print queue: " + printQueue);
    }
}
