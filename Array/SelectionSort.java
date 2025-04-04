package Array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 7, 4, 8, 3, 9, 6, 1, 5};

        int[] sortedArr = doSelectionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] doSelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            //find the min index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //replace min index with arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
