// Q4 — Counter using Static Variable

// Write a Java program that uses:

// A static variable count to track how many objects of the class are created.

// A constructor that increments count.

// A static method getCount() to return the number of created objects.

public class ObjectCounter {
    static int count = 0;

    ObjectCounter() {
        count++;
    }

    static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();
        
        System.out.println("Total objects created: " + getCount());
    }
}
