package Array;

import java.util.Arrays;

public class ArrayEvenBeforeOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 7, 8, 11, 20};
        arrayEvenAfterOdd(arr);
    }

    private static void swap(int l, int r, int[] arr) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    private static void arrayEvenAfterOdd(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            if (arr[l] % 2 != 0) {
                if (arr[r] % 2 != 0) {
                    r--;
                }
                swap(l, r, arr);
                l++;
            } else if (arr[r] % 2 != 0) {
                r--;
            }
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
