import java.util.*;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // add first
        list.addFirst(5);

        // add last
        list.addLast(40);

        // get first
        System.out.println(list.getFirst());

        // get last
        System.out.println(list.getLast());

        // remove first
        list.removeFirst();

        // remove last
        list.removeLast();

        // display
        System.out.println(list);
    }
}