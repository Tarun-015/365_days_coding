// Program 4: Wrapper Classes in Collections

// Purpose: Shows why wrapper classes are needed with ArrayList.

// File: WrapperInCollection.java
import java.util.ArrayList;

public class WrapperInCollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding primitives (auto-boxed to Integer)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Iterating and auto-unboxing
        int sum = 0;
        for(Integer num : numbers) {
            sum += num;
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
    }
}