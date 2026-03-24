package nischal_w3;

public class Q7 {
    // Attributes
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    
    public Q7(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

 
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

 
    public static void main(String[] args) {
 
        Q7 account1 = new Q7("Nischal", "ACC12345", 5000.75);

       
        account1.displayAccountInfo();
    }
}
