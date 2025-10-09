// Implement Stack Operations using Java’s Stack Class
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Python");
        stack.push("Java");
        stack.push("C++");
        stack.push("SQL");

        System.out.println("Stack: " + stack);

        System.out.println("Top Element (peek): " + stack.peek());

        System.out.println("Pop Element: " + stack.pop());
        System.out.println("After Pop: " + stack);

        System.out.println("Is Stack Empty? " + stack.empty());
    }
}


//  Concept:
// Stack follows LIFO (Last-In-First-Out) order.
// Useful in recursion, expression evaluation, undo operations, etc.