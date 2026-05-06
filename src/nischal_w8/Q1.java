package nischal_w8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        String inputFile = "one.txt";
        String outputFile = "two.txt";
 
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))
        ) {
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            System.out.println("File copied successfully from one.txt to two.txt");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
