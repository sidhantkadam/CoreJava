package Array;

import java.util.Arrays;

public class MinCostToArraySizeOne {
    public static int minCostOfArray(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];

        return ((arr.length - 1) * min);
    }

    public static void main(String[] args) {
        int[] arr = {8, 6, 10};
        System.out.println(minCostOfArray(arr));
    }
}
