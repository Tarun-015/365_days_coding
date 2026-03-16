import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        for(Integer num : list){

            list.add(40);   // allowed
        }

        System.out.println(list);
    }
}