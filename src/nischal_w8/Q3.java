package nischal_w8;

import java.io.*;
import java.util.*;

public class Q3 {

    // Method to read numbers from file
    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String part : parts) {
                    if (!part.trim().isEmpty()) {   // ✅ skip empty strings
                        numbers.add(Integer.parseInt(part.trim()));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return numbers;
    }

    // Method to get even numbers
    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    // Method to get odd numbers
    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> odds = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                odds.add(num);
            }
        }
        return odds;
    }

    // Method to write numbers to file
    public void write(List<Integer> numbers, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int num : numbers) {
                bw.write(num + " ");
            }
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Q3 program = new Q3();

        // Read numbers from one.txt
        List<Integer> numbers = program.read("one.txt");

        // Separate odd and even
        List<Integer> evens = program.getEven(numbers);
        List<Integer> odds = program.getOdd(numbers);

        // Write to files
        program.write(evens, "even.txt");
        program.write(odds, "odd.txt");

        System.out.println("Numbers separated successfully into even.txt and odd.txt");
    }
}
