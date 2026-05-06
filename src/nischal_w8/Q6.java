package nischal_w8;

import java.io.*;
import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name.trim();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Q6 {
    public static void main(String[] args) {
        String inputFile = "products.txt";   // Input file containing product;price
        String outputFile = "average_sales.csv"; // Output CSV file

        Map<String, List<Double>> productSales = new HashMap<>();

        // --- Step 1: Read products from file ---
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty() || line.contains("product")) {
                    continue; // skip header or empty lines
                }

                String[] parts = line.split(";");
                if (parts.length == 2) {
                    String productName = parts[0].trim();
                    String priceStr = parts[1].trim().replace(",", ""); // remove commas in numbers
                    double price = Double.parseDouble(priceStr);

                    productSales.putIfAbsent(productName, new ArrayList<>());
                    productSales.get(productName).add(price);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // --- Step 2: Calculate average sales ---
        Map<String, Double> averageSales = new HashMap<>();
        for (Map.Entry<String, List<Double>> entry : productSales.entrySet()) {
            List<Double> prices = entry.getValue();
            double sum = 0;
            for (double p : prices) {
                sum += p;
            }
            double avg = sum / prices.size();
            averageSales.put(entry.getKey(), avg);
        }

        // --- Step 3: Write averages to CSV ---
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Product,AveragePrice");
            bw.newLine();
            for (Map.Entry<String, Double> entry : averageSales.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
            System.out.println("Average sales exported to " + outputFile + " successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
