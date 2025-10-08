package InterviewOrExams;

    /*
        Input: int[] arr = {1, 0, 5, 3, 0, 0, 2, 3, 0};
        Output: int[] arr = {1, 5, 3, 2, 3, 0, 0, 0, 0};
    */

import java.util.Arrays;

public class KPMG1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 3, 0, 0, 2, 3, 0};

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
        System.out.println(Arrays.toString(arr));
    }
}
