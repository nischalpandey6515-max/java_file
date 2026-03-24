package nischal_w3;

public class Q10 {
  
    private double balance;

    public Q10(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Q10 account = new Q10(5000.75);
        System.out.println("Account Balance: $" + account.getBalance());
    }
}
