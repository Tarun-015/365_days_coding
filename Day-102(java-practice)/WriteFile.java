// Write a program that writes "Hello World" to a file using FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello World");
            fw.close();
            System.out.println("Successfully written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
