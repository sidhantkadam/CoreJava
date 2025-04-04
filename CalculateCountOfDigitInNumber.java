public class CalculateCountOfDigitInNumber {
    private static int calculateCountInN(int n, int k) {
        int count = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit == k) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 534583858;
        int k = 5;
        int countN = calculateCountInN(n, k);
        System.out.println(countN);
    }
}
