// Integer Caching (–128 to 127 are cached)
public class Fact1_IntegerCache {
    public static void main(String[] args) {
        Integer a = 100, b = 100;
        Integer x = 200, y = 200;
        System.out.println(a == b); // true (cached)
        System.out.println(x == y); // false (not cached)
    }
}


//  Java caches Integer objects between –128 and 127 for memory efficiency.