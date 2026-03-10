import java.util.*;

public class UnionExample {

    public static void main(String args[]) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);

        set2.add(20);
        set2.add(30);

        set1.addAll(set2);

        System.out.println(set1);
    }
}