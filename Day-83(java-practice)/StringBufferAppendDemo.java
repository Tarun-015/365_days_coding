// Description: Demonstrates the use of append(Object obj) method of StringBuffer to handle multiple data types

public class StringBufferAppendDemo {
    public static void main(String[] args) {
        // Create a StringBuffer with initial string
        StringBuffer sb = new StringBuffer("PW");

        // Append String
        sb.append("IOI");
        System.out.println("After appending string: " + sb);  // PWIOI

        // Append Integer
        sb.append(10);
        System.out.println("After appending int: " + sb);     // PWIOI10

        // Append Long
        sb.append(1234L);
        System.out.println("After appending long: " + sb);    // PWIOI101234

        // Append Float
        sb.append(45.5f);
        System.out.println("After appending float: " + sb);   // PWIOI10123445.5

        // Append Double
        sb.append(99.999);
        System.out.println("After appending double: " + sb);  // PWIOI10123445.599.999

        // Append Char
        sb.append('A');
        System.out.println("After appending char: " + sb);    // PWIOI10123445.599.999A

        // Append Boolean
        sb.append(true);
        System.out.println("After appending boolean: " + sb); // PWIOI10123445.599.999Atrue
    }
}
