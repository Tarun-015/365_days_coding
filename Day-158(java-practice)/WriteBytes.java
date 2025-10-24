// Program 1 — Write Bytes to a File
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {
    public static void main(String[] args) {
        String data = "Learning Java Byte Streams!";
        
        try (FileOutputStream fos = new FileOutputStream("byteOutput.txt")) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}


//  Concept: Writes text as bytes using FileOutputStream.