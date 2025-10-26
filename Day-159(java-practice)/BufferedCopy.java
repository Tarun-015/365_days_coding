// Program 3 — Copy File Using Buffered Streams
import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sourceBuffered.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copyBuffered.txt"))
        ) {
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            bos.flush();
            System.out.println("File copied successfully using Buffered Streams!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//  Concept: Demonstrates buffered I/O for fast file copy operation.