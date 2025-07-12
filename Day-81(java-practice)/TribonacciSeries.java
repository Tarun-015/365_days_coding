public class TribonacciSeries {

    public static void generate(int n) {
        int a = 0, b = 1, c = 2;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            int d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
        System.out.println();
    }
}
