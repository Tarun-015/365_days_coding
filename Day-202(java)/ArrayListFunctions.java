import java.util.*;

public class ArrayListFunctions {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // add at index
        list.add(1,15);

        // get element
        System.out.println(list.get(2));

        // remove element
        list.remove(1);

        // size
        System.out.println(list.size());

        // check element
        System.out.println(list.contains(30));

        // iterate
        for(int i : list){
            System.out.println(i);
        }

        // clear list
        list.clear();

        System.out.println(list);
    }
}