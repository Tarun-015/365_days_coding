// Program 1 — Write Using BufferedOutputStream
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedWrite {
    public static void main(String[] args) {
        String data = "Buffered Streams make file writing faster!";
        
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bufferedOutput.txt"))) {
            bos.write(data.getBytes());
            bos.flush(); // ensures all data is written to file
            System.out.println("Data written successfully using BufferedOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Concept: Writes data efficiently using a buffer before writing to the actual file.