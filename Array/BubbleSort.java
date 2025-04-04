package Array;

import java.util.Arrays;

public class BubbleSort {
    private static int[] performBubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int[] sortedArr = performBubbleSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
