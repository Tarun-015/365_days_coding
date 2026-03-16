import java.util.*;

public class FailFastExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){

            Integer num = it.next();

            list.add(40);   // structural modification
        }
    }
}