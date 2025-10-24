// Program 2 — Read Bytes from a File
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("byteOutput.txt")) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}


// Concept: Reads byte-by-byte from a file and converts it into characters.