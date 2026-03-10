import java.util.HashSet;

public class SearchHashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        if(set.contains(20))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}