public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana";
        String s3 = "apple";
        String s4 = "App";
        String s5 = "APPLE";

        int r1 = s1.compareTo(s2);
        System.out.println("s1.compareTo(s2): " + r1);  // < 0 ('A' < 'B')

        int r2 = s2.compareTo(s1);
        System.out.println("s2.compareTo(s1): " + r2);  // > 0

        int r3 = s1.compareTo(s3);
        System.out.println("s1.compareTo(s3): " + r3);  // < 0 ('A' < 'a' ASCII wise)

        int r4 = s1.compareToIgnoreCase(s3);
        System.out.println("s1.compareToIgnoreCase(s3): " + r4); // 0 (ignores case)

        int r5 = s1.compareTo(s4);
        System.out.println("s1.compareTo(s4): " + r5);  // > 0 ('Apple' > 'App' because 'l' > end of string)

        int r6 = s1.compareToIgnoreCase(s5);
        System.out.println("s1.compareToIgnoreCase(s5): " + r6); // 0

        int r7 = s1.compareTo(s5);
        System.out.println("s1.compareTo(s5): " + r7); // > 0 ('A' > 'A', but 'p' > 'P')
    }
}
