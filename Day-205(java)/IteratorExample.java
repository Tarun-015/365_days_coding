import java.util.*;

public class IteratorExample {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}