package nischal_w4;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.LocalDate;

public class S2 {

    // Method to validate full name
    static boolean validateName(String name) {
        return name != null && name.length() > 4;
    }

    // Method to validate mobile number
    static boolean validateMobile(String mobile) {
        return mobile.matches("0\\d{9}");
    }

    // Method to validate password
    static boolean validatePassword(String password) {
        return password.matches("[A-Za-z]+[@&]\\d+");
    }

    // Method to validate DOB format and age
    static boolean validateDOB(String dob) {
        // Accepts DD/MM/YYYY or MM/DD/YYYY
        if (!Pattern.matches("\\d{2}/\\d{2}/\\d{4}", dob)) {
            System.out.println("You have entered the Date of Birth in invalid format.");
            return false;
        }
        String[] parts = dob.split("/");
        int year = Integer.parseInt(parts[2]);
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        if (age < 21) {
            System.out.println("You must be at least 21 years old to sign up.");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 2) {
                System.out.println("Thank you for using the Application.");
                break;
            } else if (choice == 1) {
                boolean success = false;

                while (!success) {
                    System.out.print("Please enter your full name: ");
                    String name = sc.nextLine();

                    System.out.print("Please enter your mobile number (username): ");
                    String mobile = sc.nextLine();

                    System.out.print("Please enter your password: ");
                    String password = sc.nextLine();

                    System.out.print("Please confirm your password: ");
                    String confirmPassword = sc.nextLine();

                    System.out.print("Please enter your Date of Birth #DD/MM/YYYY (No space): ");
                    String dob = sc.nextLine();

                    // Validation checks
                    if (!validateName(name)) {
                        System.out.println("Full name must be longer than 4 characters.");
                        System.out.println("Please start again.\n");
                        continue;
                    }

                    if (!validateMobile(mobile)) {
                        System.out.println("Mobile number must be 10 digits starting with 0.");
                        System.out.println("Please start again.\n");
                        continue;
                    }

                    if (!validatePassword(password)) {
                        System.out.println("Password must start with alphabets, followed by @ or &, and end with numbers.");
                        System.out.println("Example: John@0125 or John&25");
                        System.out.println("Please start again.\n");
                        continue;
                    }

                    if (!password.equals(confirmPassword)) {
                        System.out.println("Your passwords are not matching.");
                        System.out.println("Please start again.\n");
                        continue;
                    }

                    if (!validateDOB(dob)) {
                        System.out.println("Please start again.\n");
                        continue;
                    }

                    // If all validations pass
                    System.out.println("\nYou have successfully signed up.");
                    success = true;
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}

