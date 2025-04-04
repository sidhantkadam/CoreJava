package Array;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 1, 1, 1, 1, 1, 1};
        int[] sum = new int[Math.max(a.length, b.length)];

        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = carry;
            if (i >= 0) {
                d += a[i];
            }
            if (j >= 0) {
                d += b[j];
            }
            carry = d / 10;
            d = d % 10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.println(carry);
        }
        for (int l : sum) {
            System.out.println(l);
        }
    }
}
