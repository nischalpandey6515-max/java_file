package nischal_w8;

import java.io.*;

class Student {
    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private String semester;

    public Student(String firstName, String lastName, String address, String contactNumber, String semester) {
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

public class Q5 {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv", true)) // append mode
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

            Student student = new Student(firstName, lastName, address, contactNumber, semester);

            bw.write(student.toCSV());
            bw.newLine();

            System.out.println("Student information saved to students.csv successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
