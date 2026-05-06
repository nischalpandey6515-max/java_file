package nischal_w8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // change to your file name
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split by whitespace, ignore multiple spaces
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total number of words: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
