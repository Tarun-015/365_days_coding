//Square Alphabet Frame

public class Pattern32 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print(ch + " ");
                else
                    System.out.print("  ");
            }
            ch++;
            System.out.println();
        }
    }
}
