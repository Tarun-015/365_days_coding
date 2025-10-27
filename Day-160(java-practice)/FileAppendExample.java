// Program 4 — Append Text to an Existing File
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("notes.txt", true)) { // true enables append mode
            fw.write("\nAppending new content to existing file!");
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//  Concept: Demonstrates how to append new text to an existing file using FileWriter(true).