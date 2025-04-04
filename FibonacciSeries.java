public class FibonacciSeries {
    //  0,1,1,2,3,5,8,13,21,34....
    private static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        int i = 10;
        fibonacci(i);
    }
}
