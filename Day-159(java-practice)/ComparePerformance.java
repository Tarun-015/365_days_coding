// Program 4 — Compare Performance: Buffered vs Non-Buffered
import java.io.*;

public class ComparePerformance {
    public static void main(String[] args) throws IOException {
        long start, end;
        
        // Non-buffered copy
        try (FileInputStream fis = new FileInputStream("largeFile.txt");
             FileOutputStream fos = new FileOutputStream("copy1.txt")) {
            start = System.currentTimeMillis();
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            end = System.currentTimeMillis();
            System.out.println("Non-buffered copy time: " + (end - start) + " ms");
        }

        // Buffered copy
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largeFile.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.txt"))) {
            start = System.currentTimeMillis();
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            bos.flush();
            end = System.currentTimeMillis();
            System.out.println("Buffered copy time: " + (end - start) + " ms");
        }
    }
}


//  Concept: Measures the time difference — showing how buffering improves performance.