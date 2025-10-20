// CopyOnWriteArrayList Example
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        Thread writer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                list.add("Item-" + i);
                System.out.println("Writer added: Item-" + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        Thread reader = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Reader snapshot: " + list);
                try { Thread.sleep(120); } catch (InterruptedException e) {}
            }
        });

        writer.start();
        reader.start();
    }
}


// Output Example

// Reader snapshot: [A, B]
// Writer added: Item-1
// Reader snapshot: [A, B, Item-1]
// Writer added: Item-2
// Reader snapshot: [A, B, Item-1, Item-2]