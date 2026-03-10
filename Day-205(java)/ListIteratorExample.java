import java.util.*;

public class ListIteratorExample {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> li = list.listIterator();

        while(li.hasNext())
            System.out.println(li.next());

        while(li.hasPrevious())
            System.out.println(li.previous());
    }
}