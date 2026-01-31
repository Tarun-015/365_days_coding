public class Outer {
    private String msg = "Hello from Outer class";

    class Inner {
        void display() {
            System.out.println(msg); // can access private members of outer
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner in = o.new Inner(); // object of inner class
        in.display();
    }
}