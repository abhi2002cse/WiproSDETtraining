package sessionAssignment;
class BankAccount {
    
    // final variable
    private final int accountNumber;
    private String customerName;
    private double balance;

    // Constructor 
    public BankAccount(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Getter for account number (no setter!)
    public int getAccountNumber() {
        return accountNumber;
    }

    // Other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(12345, "Abhishek", 5000);

        acc1.displayDetails();

        //  This will give error 
        // acc1.accountNumber = 99999;
    }
}
