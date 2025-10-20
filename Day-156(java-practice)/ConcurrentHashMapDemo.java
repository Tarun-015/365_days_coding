
// public ConcurrentHashMap Example
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        Thread writer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                map.put("Key" + i, i);
                System.out.println("Writer added Key" + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        Thread reader = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Reader sees: " + map);
                try { Thread.sleep(150); } catch (InterruptedException e) {}
            }
        });

        writer.start();
        reader.start();
    }
}


//  Output Example

// Writer added Key1
// Reader sees: {Key1=1}
// Writer added Key2
// Reader sees: {Key1=1, Key2=2}
// ... 