public class DecimalToAnyBase {
    public static void main(String[] args) {
        int num = 634;
        int b = 8;

        int rv = 0;
        int p = 1;
        while (num > 0) {
            int n = num % b;
            num = num / b;

            rv += n * p;
            p = p * 10;
        }
        System.out.println(rv);
    }
}
