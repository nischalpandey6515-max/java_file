package nischal_7;

import java.util.Scanner;
// Customer class
class Customer {
    protected String firstName;
    protected String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

// Account class
class Account extends Customer {
    private String accountNumber;
    private double balance;

    public Account(String firstName, String lastName, String accountNumber, double balance) {
        super(firstName, lastName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient or invalid funds");
            return false;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void display() {
        System.out.println("Name: " + getFullName());
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------");
    }
}

// Transaction class
class Transaction {
    public void transfer(Account from, Account to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed!");
        }
    }
}

// Main class
public class Test {
    public static Account findAccount(Account[] accounts, String accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account a1 = new Account("Nischal", "Pandey", "1", 1000.00);
        Account a2 = new Account("Micheal", "Karki", "2", 500.00);

        Account[] accounts = {a1, a2};

        Transaction t = new Transaction();

        int choice;

        do {
            System.out.println("\n=== Banking System ===");
            System.out.println("1. Display Accounts");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Account acc : accounts) {
                        acc.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String depAcc = sc.next();
                    Account acc1 = findAccount(accounts, depAcc);

                    if (acc1 != null) {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        acc1.deposit(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String witAcc = sc.next();
                    Account acc2 = findAccount(accounts, witAcc);

                    if (acc2 != null) {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        acc2.withdraw(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter FROM Account Number: ");
                    String fromAcc = sc.next();
                    Account from = findAccount(accounts, fromAcc);

                    System.out.print("Enter TO Account Number: ");
                    String toAcc = sc.next();
                    Account to = findAccount(accounts, toAcc);

                    if (from != null && to != null) {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        t.transfer(from, to, amt);
                    } else {
                        System.out.println("Invalid account number!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}