package Array;
//   3 5 6 2 1

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 1};

        int l = 0;
        int r = arr.length - 1;
        while (l != r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
