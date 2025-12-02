// Strings are Immutable, But References Aren’t
public class Fact3_StringImmutability {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;
        s1 = s1.concat(" Rocks!");
        System.out.println(s2); // Java
        System.out.println(s1); // Java Rocks!
    }
}


// The original "Java" string never changed — a new object was created.