public class HashFunctionExample {

    public static void main(String[] args) {

        int key = 37;
        int tableSize = 10;

        int index = key % tableSize;

        System.out.println("Index position: " + index);
    }
}