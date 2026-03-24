package nischal_w3;

public class Q12 {
    private int customerId;
    private String name;
    private Account account;   


    public Q12(int customerId, String name, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.account = account;
    }

  
    public int getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public Account getAccount() {
        return account;
    }

    // Setters
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

   
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("-----------------------------");
    }

   
    public static void main(String[] args) {
        Account acc1 = new Account(5000.75);
        Account acc2 = new Account(12000.50);

        Q12 customer1 = new Q12(101, "Nischal", acc1);
        Q12 customer2 = new Q12(102, "saius", acc2);

        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();

      
        customer1.setName("Nischal  pandey");
        customer1.getAccount().setBalance(8000.00);

        System.out.println("After updating customer1:");
        customer1.displayCustomerInfo();
    }
}
class Account {
    private double balance;
    
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

