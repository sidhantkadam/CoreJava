package Array;

import java.util.Arrays;

public class PrefixSum {
    public static int[] prefixSum(int[] arr) {
        int[] returnArr = new int[arr.length];
        int sum = arr[0];
        returnArr[0] = sum;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            returnArr[i] = sum;
        }
        return returnArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int[] ints = prefixSum(arr);
        System.out.println(Arrays.toString(ints));
    }
}
