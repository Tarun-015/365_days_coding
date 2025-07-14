// Description: Demonstrates how to use String methods on StringBuilder content

public class StringBuilderToStringMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("RajaRamMohanRoy");

        // Convert to String to use indexOf and other String methods
        String str = sb.toString();

        // 1. indexOf
        System.out.println("First occurrence of 'a': " + str.indexOf("a"));

        // 2. Original content
        System.out.println("Original StringBuilder content: " + sb);

        // 3. Search for a non-existing char
        System.out.println("Index of 'p': " + str.indexOf("p")); // -1 if not found

        // 4. lastIndexOf with fromIndex
        System.out.println("Last index of 'a' before index 11: " + str.lastIndexOf("a", 11));

        // 5. Unicode code point at index 4
        System.out.println("Unicode of char at index 4: " + str.codePointAt(4)); // 'R' → 82

        // 6. Substring from index 4 to 7
        System.out.println("Substring (4,7): " + str.substring(4, 7)); // amM

        // 7. Substring from index 4 to end
        System.out.println("Substring from index 4: " + str.substring(4)); // amMohanRoy
    }
}
