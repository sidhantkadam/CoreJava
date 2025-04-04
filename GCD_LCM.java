    /*
       input: 36, 24
       output: 12, 72
    */

public class GCD_LCM {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 24;

        int onum1 = num1;
        int onum2 = num2;
        while (num1 % num2 != 0) {
            int dev = num1 % num2;
            num1 = num2;
            num2 = dev;
        }

        int gcd = num2;
        int r = (onum1 * onum2) / gcd;

        System.out.println(gcd);
        System.out.println(r);
    }
}
