public class AltPrimeComposite {

    public static void generate(int limit) {
        int prime = 2, comp = 4, count = 0;
        while (count < limit) {
            System.out.print(prime + " ");
            count++;
            if (count < limit) {
                System.out.print(comp + " ");
                count++;
            }

            int nextPrime = prime + 1;
            while (!isPrime(nextPrime)) nextPrime++;
            prime = nextPrime;

            comp += 1;
            while (isPrime(comp)) comp++;
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}
