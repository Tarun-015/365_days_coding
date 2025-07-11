// Floyd's Triangle with Even Numbers

public class Pattern30 {
    public static void main(String[] args) {
        int n = 5, num = 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}
