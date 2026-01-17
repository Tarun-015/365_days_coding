abstract class Payment {
    abstract void pay();
}

class UPI extends Payment {
    void pay() { System.out.println("Payment via UPI"); }
}

class Card extends Payment {
    void pay() { System.out.println("Payment via Card"); }
}

public class PayDemo {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();           // UPI version
        p = new Card();
        p.pay();           // Card version
    }
}
