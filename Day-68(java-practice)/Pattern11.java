//Alphabet Pyramid (A, B, C...)

public class Pattern11 {
     public static void main(String[] args) {
        int n = 5;
        char ch;

        for (int i = 0; i < n; i++) {
            ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
