// Question:
// You are designing a BankAccount class for a banking application. The account’s balance should not be directly accessible from outside the class, but it should be possible to:

// Deposit an amount to the account.

// Withdraw an amount from the account only if the balance is sufficient.

// Check the current balance.

// Requirements:

// Use encapsulation principles (private fields, public getters/setters/methods).

// Prevent direct modification of balance from outside the class.

// Ensure balance never goes negative.

// Expected Output Example:

// Deposit of 1000 successful. Current balance: 1000
// Withdrawal of 500 successful. Current balance: 500
// Insufficient funds. Current balance: 500

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

public class Demo {
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
