// == vs .equals()
public class Fact4_StringComparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);     // true (same pool)
        System.out.println(s1 == s3);     // false (different object)
        System.out.println(s1.equals(s3)); // true (same value)
    }
}


//  == checks reference, .equals() checks content.