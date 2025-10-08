// Create an ArrayList of Integers and Print All Elements using For, For-Each, and Iterator
import java.util.*;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Using For Loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println("\nUsing For-Each Loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
