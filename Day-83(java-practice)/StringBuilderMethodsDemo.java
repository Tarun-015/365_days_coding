// Description: Demonstrates key methods of StringBuilder - capacity, length, ensureCapacity, setLength, and trimToSize

public class StringBuilderMethodsDemo {
    public static void main(String[] args) {
        // Create an empty StringBuilder
        StringBuilder sb = new StringBuilder();

        // Append "Indian"
        sb.append("Indian");

        // Check default capacity and current length
        System.out.println("Initial capacity: " + sb.capacity()); // Default capacity = 16
        System.out.println("Length after append: " + sb.length()); // Length = 6
        System.out.println("Content: " + sb); // Output: Indian

        // Ensure minimum capacity of 20
        sb.ensureCapacity(20);
        System.out.println("Capacity after ensureCapacity(20): " + sb.capacity()); // Grows to (old*2)+2 if needed

        // Set length to 5 (truncate)
        sb.setLength(5);
        System.out.println("Length after setLength(5): " + sb.length()); // Now length is 5
        System.out.println("Content after trimming: " + sb); // Output: India

        // Trim capacity to match length
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity()); // Capacity = 5
    }
}
