// Question 4: Encapsulation with Constructor
//  Create a class BankAccount with fields:

// accountHolder (String)

// balance (double)

//  Constructor should take both values.
//  Create a method withdraw(double amt) which subtracts amount only if sufficient balance is available.
// Also create a deposit(double amt) method.

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        }
    }

    public void printDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Initial Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Tarun", 5000);
        ba.printDetails();
        System.out.println("Withdrawing 6000...");
        ba.withdraw(6000);
        System.out.println("Withdrawing 2000...");
        ba.withdraw(2000);
    }
}
