package nischal_w3;

public class BankAccount {
    int accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    // ✅ Add this constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Address: " + accountHolderAddress);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500000.35); // now valid

        acc.accountNumber = 252467;
        acc.accountHolderName = "Nischal Pandey";
        acc.accountHolderAddress = "Biratnagar, Nepal";

        acc.display();
    }
}
