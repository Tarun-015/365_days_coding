import java.util.ArrayList;

public class GetExample {

    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}