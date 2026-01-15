final class Base {
    final int VALUE = 10;

    final void display() {
        System.out.println("Final method: " + VALUE);
    }
}

class Test {  // cannot extend Base (because it's final)
    public static void main(String[] args) {
        Base b = new Base();
        b.display();
        // b.VALUE = 20; ❌ Error: can't modify final variable
    }
}
