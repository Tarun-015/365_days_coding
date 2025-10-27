// Program 3 — Using BufferedReader & BufferedWriter
import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedNotes.txt"));
            BufferedReader br = new BufferedReader(new FileReader("bufferedNotes.txt"))
        ) {
            bw.write("BufferedWriter makes writing faster!");
            bw.newLine();
            bw.write("BufferedReader allows reading line by line.");
            bw.flush();

            System.out.println("Reading from file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 
// Concept: Combines both buffered character streams for faster text read/write.