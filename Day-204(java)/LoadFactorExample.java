public class LoadFactorExample {

    public static void main(String args[]) {

        int elements = 6;
        int tableSize = 10;

        double loadFactor = (double)elements/tableSize;

        System.out.println("Load Factor = " + loadFactor);
    }
}