// Description: Demonstrates insert, setCharAt, delete, replace, and reverse operations using StringBuilder

public class StringBuilderMethodsPart2 {
    public static void main(String[] args) {
        // Initial StringBuilder
        StringBuilder sb = new StringBuilder("Raja");
        sb.append("MohanRy"); // Raja + MohanRy = RajaMohanRy
        System.out.println("After append: " + sb); // RajaMohanRy


        sb.insert(10, 'o'); // Insert 'o' at position 10
        System.out.println("After insert(10, 'o'): " + sb); // RajaMohanRyo


        sb.insert(4, "Ram"); // Insert "Ram" at position 4
        System.out.println("After insert(4, \"Ram\"): " + sb); // RajaRamMohanRyo


        sb.setCharAt(5, 'a'); // Change char at index 5 to 'a'
        System.out.println("After setCharAt(5, 'a'): " + sb); // RajaRaMohanRyo


        sb.deleteCharAt(5); // Delete character at index 5
        System.out.println("After deleteCharAt(5): " + sb); // RajaRMohanRyo


        sb.delete(4, 11); // Delete from index 4 to 10 (end index not included)
        System.out.println("After delete(4, 11): " + sb); // RajaRyo


        sb.replace(0, 4, "Ranii"); // Replace "Raja" with "Ranii"
        System.out.println("After replace(0, 4, \"Ranii\"): " + sb); // RaniiRyo

        
        sb.reverse(); // Reverse the StringBuilder
        System.out.println("After reverse(): " + sb); // oyRiiinaR
    }
}
