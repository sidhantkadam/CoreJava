        //4*3*2*1 = 24

public class FactorialOfInteger {
    private static long factorial(long n) {
        long fact = 1;
        if(n==1)
            return n;
        for (int i = 1; i <= n; i++) {
            fact = n * factorial(n - 1);
        }
        return fact;
    }

    public static void main(String[] args) {
        long n = 3;
        long fact = factorial(n);
        System.out.println(fact);
    }
}
