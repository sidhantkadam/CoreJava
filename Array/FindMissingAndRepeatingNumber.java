package Array;

import java.util.Arrays;

public class FindMissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 2, 3, 7, 9, 1};
        int missing = 0;
        int repeating = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                repeating = arr[i];

            if (arr[i + 1] - arr[i] > 1)
                missing = arr[i] + 1;
        }
        System.out.println(repeating);
        System.out.println(missing);
    }
}
