// Program 1 — Write to a Text File Using FileWriter
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("notes.txt")) {
            fw.write("Java FileWriter Example.\n");
            fw.write("Character streams are used to handle text data.");
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//  Concept: Writes text data character by character to a file using FileWriter.