// Program 3: Wrapper Classes – Basic Operations

// Purpose: Shows boxing, unboxing, and utility methods of wrapper classes.

// File: WrapperBasic.java
public class WrapperBasic {
    public static void main(String[] args) {
        int num = 42;

        // Boxing
        Integer obj = Integer.valueOf(num);
        // Auto-boxing
        Integer autoObj = num;

        // Unboxing
        int n1 = obj.intValue();
        // Auto-unboxing
        int n2 = autoObj;

        System.out.println("Boxed: " + obj + ", Auto-boxed: " + autoObj);
        System.out.println("Unboxed: " + n1 + ", Auto-unboxed: " + n2);

        // Using wrapper method
        String s = "123";
        int parsed = Integer.parseInt(s);
        System.out.println("Parsed integer: " + parsed);
    }
}