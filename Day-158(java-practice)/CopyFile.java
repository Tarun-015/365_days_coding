// Program 3 — Copy File Content (Byte Stream)
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("copy.txt");
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error while copying file.");
            e.printStackTrace();
        }
    }
}


//  Concept: Demonstrates file copy operation using byte streams (works for both text and binary files).