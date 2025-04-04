package Array;

import java.util.Arrays;

public class ReplaceGreatestElementWithRight {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int maxLeft = -1;
        for (int i = arr.length - 1; i > 0; --i) {
            int temp = arr[i];
            arr[i] = maxLeft;
            maxLeft = Math.max(maxLeft, temp);
        }
        System.out.println(Arrays.toString(arr));
    }
}
