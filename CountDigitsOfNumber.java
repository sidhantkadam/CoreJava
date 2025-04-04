public class CountDigitsOfNumber {
    public static void main(String[] args) {
        int n = 456765;
        int count = countDigits(n);
        System.out.println(count);
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
