//1. Using System.out.write() (low-level, works with bytes)

import java.util.*;

public class ReverseList {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        for (int i = list.size() - 1; i >= 0; i--) {
            String val = list.get(i) + " ";
            System.out.write(val.getBytes()); // write bytes directly
        }
    }
}


//2. Using OutputStreamWriter

import java.io.OutputStreamWriter;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) throws Exception {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        OutputStreamWriter out = new OutputStreamWriter(System.out);
        for (int i = list.size() - 1; i >= 0; i--) {
            out.write(list.get(i) + " ");
        }
        out.flush(); // ensure output is written
    }
}


//3. Using BufferedWriter (faster for large output)

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i) + " ");
        }
        bw.flush(); // must flush, else nothing prints
    }
}



