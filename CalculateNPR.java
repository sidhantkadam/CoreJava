public class CalculateNPR {
    private static long calculateNPR(int n, int r) {
        long npr;
        long nFact = calculateNFact(n);
        long nrFact = calculateNFact(n - r);
        npr = nFact / nrFact;
        return npr;
    }

    private static long calculateNFact(long n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 42;
        int r = 30;
        long npr = calculateNPR(n, r);
        System.out.println(npr);
    }
}
