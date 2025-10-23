// Program 4 — Read File Line by Line (BufferedReader)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBuffered {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading file with BufferedReader.");
            e.printStackTrace();
        }
    }
}


//  Concept: Uses buffering to improve reading efficiency — reads line-by-line.