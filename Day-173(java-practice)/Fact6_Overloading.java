// Overloading Works on Compile-Time
public class Fact6_Overloading {
    void show(int a) { System.out.println("int"); }
    void show(double a) { System.out.println("double"); }

    public static void main(String[] args) {
        new Fact6_Overloading().show(5.5f); // float -> double (widening)
    }
}


//  Method overloading decisions happen at compile time, not runtime.