import java.util.*;

public class StructuralModification {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        for(Integer num : list){
            list.add(40); // structural modification
        }
    }
}