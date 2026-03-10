import java.util.*;

public class DescendingIteratorExample {

    public static void main(String args[]) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);

        Iterator<Integer> it = dq.descendingIterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}