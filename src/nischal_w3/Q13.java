package nischal_w3;

public class Q13 {

    // Inner class BankAccount
    static class BankAccount {
        private String accountHolder;
        private int accountNumber;
        private double balance;

        // Default constructor
        public BankAccount() {
            this("Unknown", 0, 0.0); // constructor chaining
        }

        // Constructor with account holder only
        public BankAccount(String accountHolder) {
            this(accountHolder, 0, 0.0);
        }

        // Constructor with account holder and account number
        public BankAccount(String accountHolder, int accountNumber) {
            this(accountHolder, accountNumber, 0.0);
        }

        // Constructor with all parameters
        public BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Display account details
        public void displayAccount() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
            System.out.println("-----------------------------");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Using different constructors
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Nischal");
        BankAccount acc3 = new BankAccount("Nischal", 12345);
        BankAccount acc4 = new BankAccount("Nischal", 12345, 5000.0);

        // Displaying details
        acc1.displayAccount();
        acc2.displayAccount();
        acc3.displayAccount();
        acc4.displayAccount();
    }
}
