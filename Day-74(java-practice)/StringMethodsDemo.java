public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // indexOf()
        System.out.println(str.indexOf('o'));        // 4
        System.out.println(str.indexOf("lo"));       // 3
        System.out.println(str.indexOf('o', 5));     // 7
        System.out.println(str.indexOf("o", 6));     // 7

        // lastIndexOf()
        System.out.println(str.lastIndexOf('o'));        // 7
        System.out.println(str.lastIndexOf("lo"));       // 3
        System.out.println(str.lastIndexOf('o', 6));     // 4
        System.out.println(str.lastIndexOf("o", 6));     // 4

        // charAt()
        System.out.println(str.charAt(0));           // H
        System.out.println(str.charAt(5));           // W
        // System.out.println(str.charAt(20));       // Error: StringIndexOutOfBoundsException

        // toUpperCase()
        System.out.println(str.toUpperCase());       // HELLOWORLD

        // toLowerCase()
        System.out.println(str.toLowerCase());       // helloworld

        // startsWith()
        System.out.println(str.startsWith("Hel"));   // true
        System.out.println(str.startsWith("llo", 2));// true
        System.out.println(str.startsWith("Wor"));   // false

        // endsWith()
        System.out.println(str.endsWith("rld"));     // true
        System.out.println(str.endsWith("World"));   // true
        System.out.println(str.endsWith("ld!"));     // false
    }
}
