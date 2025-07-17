//Check if Two Strings are Rotations of Each Other

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Yes, they are rotations.");
        } else {
            System.out.println("No, they are not rotations.");
        }
    }
}
