//  Question:
// Write a Java class BankAccount that encapsulates account details.

// The account number and balance should be private.

// Provide public getter methods for both, but only a public method to deposit and withdraw money (with validation so balance never goes negative).

// In the main method, create an object and demonstrate deposit, withdrawal, and viewing the balance. {
    

class BankAccount {
    // Encapsulated fields (private)
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object
        BankAccount account = new BankAccount("ACC12345", 5000);

        // Access via methods (not directly)
        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Current Balance: ₹" + account.getBalance());

        // Deposit and withdraw
        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(7000); // Invalid case

        // Final balance
        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
