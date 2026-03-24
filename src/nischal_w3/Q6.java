package nischal_w3;

import java.util.Scanner;

public class Q6 {
    boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is turned OFF");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q6 lamp = new Q6();

        while (true) {
            System.out.println("\n--- LAMP MENU ---");
            System.out.println("Current Status: " + (lamp.isOn ? "ON" : "OFF"));
            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number!");
                sc.next(); // discard invalid input
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (lamp.isOn) {
                        System.out.println("Lamp is already ON");
                    } else {
                        lamp.turnOn();
                    }
                    break;

                case 2:
                    if (!lamp.isOn) {
                        System.out.println("Lamp is already OFF");
                    } else {
                        lamp.turnOff();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    return; // end the program

                default:
                    System.out.println("Invalid choice! Enter 1, 2, or 3.");
            }
        }
    }
}
