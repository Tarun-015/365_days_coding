import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate ignored

        System.out.println(set);
    }
}