// Question 4 (Run-Time Polymorphism / Overriding)

// Make a parent class Bank with a method getInterestRate().

// SBI returns 5%

// ICICI returns 6%

// HDFC returns 7%
// Print interest rates using run-time polymorphism.

class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.0;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 6.0;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        Bank b3 = new HDFC();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b3.getInterestRate() + "%");
    }
}
