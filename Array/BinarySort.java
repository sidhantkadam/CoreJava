package Array;

import java.util.Arrays;

    /*
    After sorting :
    [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
    */

public class BinarySort {

    private static void sortArrayAsPerBinary(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1) {
                if (arr[right] == 0) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        sortArrayAsPerBinary(arr);
        System.out.println("After sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
