// “Final” Means Reference Can’t Change, Not Object
public class Fact7_FinalReference {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Java");
        sb.append(" Rocks!");
        System.out.println(sb); // Java Rocks!
        // sb = new StringBuilder("Python"); // ❌ not allowed
    }
}


//  The reference is final, but the object can still be modified.