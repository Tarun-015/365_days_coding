class Account {
    private double balance; // private -> hidden

    public void setBalance(double b) {
        if (b > 0)
            balance = b;
        else
            System.out.println("Invalid amount");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        System.out.println("Balance: " + a.getBalance());
    }
}
