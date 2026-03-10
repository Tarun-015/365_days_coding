import java.util.TreeSet;

public class TreeSetMethods {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Contains 20: " + set.contains(20));
    }
}