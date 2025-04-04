public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int n = 1172;
        int b = 8;

        int rev = 0;
        int p = 1;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;

            rev += digit * p;
            p = p * b;
        }
        System.out.println(rev);
    }
}
