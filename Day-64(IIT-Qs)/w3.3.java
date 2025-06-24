// Create BankAccount class that has the following instance variables and methods:
// Instance variables:
//     accountNumber
//     name
//     balance
//     final variable: minBalance
// Private method:
//     checkMinBalance(amount) - returns false if balance - amount <= minBalance else returns true

// Public methods:

//     balance( ) - prints the balance
//     deposit(amount) - updates balance = balance + amount
//     withdraw(amount) - calls the checkMinBalance(amount) method,
//                                     if it returns true update balance = balance - amount else prints Transaction failed


import java.util.*;
    class BankAccount{
        int accountNumber;
        String name;
        int balance;
        final int minBalance = 100;
        private boolean checkMinBalance(int amount){
            if(balance - amount <= minBalance){
                return false;
            }
            else{
              return true;
            }
        }
//Fill the code here

        // Constructor
    public BankAccount(int accountNumber, String name, int balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Method to display balance
    public void balance() {
        System.out.println(balance);
    }

    // Method to deposit amount
    public void deposit(int amount) {
        balance += amount;
    }

    // Method to withdraw amount after checking min balance
    public void withdraw(int amount) {
        if (checkMinBalance(amount)) {
            balance -= amount;
        } else {
            System.out.println("Transaction failed");
        }
    }

}
    class AccountCheck{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int amnt = sc.nextInt( );
            int amnt1 = sc.nextInt( );
            BankAccount b = new BankAccount(1890, "rahul", 1000);
            b.deposit(amnt);
            b.balance();
            b.withdraw(amnt1);
            b.balance();
        }
    
    }