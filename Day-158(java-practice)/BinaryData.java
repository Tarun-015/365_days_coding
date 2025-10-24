// Program 4 — Write and Read Binary Data
import java.io.*;

public class BinaryData {
    public static void main(String[] args) {
        String filename = "data.bin";

        // Writing binary data
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(65); // ASCII for 'A'
            fos.write(66); // ASCII for 'B'
            fos.write(67); // ASCII for 'C'
            System.out.println("Binary data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing binary data.");
            e.printStackTrace();
        }

        // Reading binary data
        try (FileInputStream fis = new FileInputStream(filename)) {
            int value;
            while ((value = fis.read()) != -1) {
                System.out.println("Read byte: " + value + " (" + (char) value + ")");
            }
        } catch (IOException e) {
            System.out.println("Error reading binary data.");
            e.printStackTrace();
        }
    }
}


//  Concept: Handles low-level byte data (useful for images, media, etc.).