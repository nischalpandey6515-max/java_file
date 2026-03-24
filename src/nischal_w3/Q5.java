package nischal_w3;

import java.util.Scanner;

public class Q5 {
    private String accountHolder = "Nischal Pandey";
    private double balance = 1000.0;

    // Deposit method
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
        System.out.println("Current Balance: $" + balance);
    }

    // Withdraw method
    public void withdrawMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q5 account = new Q5();

        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("Account Holder: " + account.accountHolder);
            System.out.println("Balance: $" + account.balance);
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.depositMoney(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    account.withdrawMoney(wit);
                    break;

                case 3:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
