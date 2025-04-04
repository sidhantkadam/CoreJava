public class PrintDigitsOfNumber {
    private static void printDigitsOfNumber(int n) {
        int digits = 0;
        int temp = n;
        //calculating the digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        int div = (int) Math.pow(10, digits - 1);

        while (div != 0) {
            int q = n / div;      // dividing the number by div
            System.out.println(q);
            n = n % div;          // remove each element from first position.
            div = div / 10;       // reduce the div by one zero
        }
    }

    public static void main(String[] args) {
        int n = 463654635;
        printDigitsOfNumber(n);
    }
}
