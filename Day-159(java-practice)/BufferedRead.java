// Program 2 — Read Using BufferedInputStream
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedRead {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bufferedOutput.txt"))) {
            int b;
            while ((b = bis.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Concept: Reads data using a buffer, improving performance compared to raw FileInputStream.