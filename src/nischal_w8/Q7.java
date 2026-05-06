package nischal_w8;

import java.io.*;
import java.util.*;

class Student1 {
    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String semester;

    // Constructor
    public Student1(String firstName, String lastName, String address, String contactNumber, String semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }

    // Convert student info to CSV format
    public String toCSV() {
        return firstName + "," + lastName + "," + address + "," + contactNumber + "," + semester;
    }
}

public class Q7 {
    public static void main(String[] args) {
        String csvFile = "students.csv";

        // Step 1: Take input and write to CSV
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true)) // append mode
        ) {
            System.out.print("Enter First Name: ");
            String firstName = br.readLine();

            System.out.print("Enter Last Name: ");
            String lastName = br.readLine();

            System.out.print("Enter Address: ");
            String address = br.readLine();

            System.out.print("Enter Contact Number: ");
            String contactNumber = br.readLine();

            System.out.print("Enter Semester: ");
            String semester = br.readLine();

            Student1 student = new Student1(firstName, lastName, address, contactNumber, semester);

            bw.write(student.toCSV());
            bw.newLine();

            System.out.println("Student information saved to students.csv successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while writing: " + e.getMessage());
        }

        // Step 2: Read CSV and export each column to separate text files
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Define headers
            String[] headers = {"FIRST_NAME", "LAST_NAME", "ADDRESS", "CONTACT_NUMBER", "SEMESTER"};

            // Prepare writers for each header
            Map<String, BufferedWriter> writers = new HashMap<>();
            for (String header : headers) {
                writers.put(header, new BufferedWriter(new FileWriter(header + ".txt", true)));
            }

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < headers.length && i < values.length; i++) {
                    writers.get(headers[i]).write(values[i]);
                    writers.get(headers[i]).newLine();
                }
            }

            // Close all writers
            for (BufferedWriter writer : writers.values()) {
                writer.close();
            }

            System.out.println("Data exported into individual text files based on headers.");
        } catch (IOException e) {
            System.out.println("Error occurred while exporting: " + e.getMessage());
        }
    }
}
