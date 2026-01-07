import java.io.*;

class DuckDemo {
    void readFile() throws IOException {
        // throws tells caller to handle it
        throw new IOException("File not found!");
    }

    void processFile() throws IOException {
        // again ducking exception to main
        readFile();
    }

    public static void main(String[] args) {
        DuckDemo obj = new DuckDemo();
        try {
            obj.processFile();  // caller (main) handles the exception
        } catch (IOException e) {
            System.out.println("Handled in main: " + e);
        }
    }
}
