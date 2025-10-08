package Array;


import java.util.Arrays;

public class ShiftZeroToLast {
    public static int[] shiftZeroToLast(int[] arr) {
        int n = arr.length - 1;
        int[] returnArr = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                returnArr[j++] = arr[i];
            }
        }
        return returnArr;
    }

    public static void shiftZerosToLast(int[] arr) {
        int l = 0;
        int r = 0;

        while (r < arr.length) {
            if (arr[r] != 0) {
                if (l != r) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                }
                l++;
            }
            r++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 3, 0, 0, 2, 3, 0};
        int[] arr1 = {1, 0, 5, 3, 0, 0, 2, 3, 0};
        int[] ints = shiftZeroToLast(arr);
        shiftZerosToLast(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(ints));
    }
}
