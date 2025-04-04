package Array;

import java.util.Arrays;

public class SortArray012 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
        int[] array = applyDutchFlagAlgoritm(arr);
        System.out.println(Arrays.toString(array));
    }


    static void swap(int[] a, int position1, int position2) {
        int temp = a[position1];
        a[position1] = a[position2];
        a[position2] = temp;
    }

    private static int[] applyDutchFlagAlgoritm(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }
}
