package Array;

import java.util.Arrays;

public class RotateAnArray {

    private static void rotateArrayByRight(int[] arr, int d) {
        int n = arr.length - 1;
        for (int j = 0; j < d; j++) {
            int last = arr[n];
            for (int i = n; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
    }

    private static void rotateArrayByLeft(int[] arr, int d) {
        int n = arr.length - 1;
        for (int j = 0; j < d; j++) {
            int first = arr[0];
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        rotateArrayByLeft(arr, d);
        System.out.println("Left: " + Arrays.toString(arr));
        rotateArrayByRight(arr, d);
        System.out.println("Right: " + Arrays.toString(arr));

    }
}
