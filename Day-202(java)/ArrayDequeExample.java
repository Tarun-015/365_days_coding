import java.util.*;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);

        dq.addFirst(5);
        dq.addLast(40);

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);
    }
}