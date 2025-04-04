package Array;

import java.util.Arrays;

public class MissingNumber {
    public static int foundMissingUsingSort(int[] arr) {
        Arrays.sort(arr);
        int diff;
        int missing = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            diff = arr[i + 1] - arr[i];
            if (diff > 1) {
                missing = arr[i] + 1;
            }
        }
        return missing;
    }

    public static int foundMissingUsingOther(int[] arr) {
        int missing = 0;
        int size = arr.length + 1;

        for (int i = 1; i <= size; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
            }
        }
        return missing;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(foundMissingUsingSort(arr));
        System.out.println(foundMissingUsingOther(arr));
    }
}
