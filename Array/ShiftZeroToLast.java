package Array;


import java.util.Arrays;

public class ShiftZeroToLast {
    public static int[] shiftZeroToLast(int[] arr) {
        int n = arr.length - 1;
        int[] returnArr = new int[n];
        int j = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                returnArr[j++] = arr[i];
            }
        }
        return returnArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 3, 0, 0, 2, 3, 0};
        int[] ints = shiftZeroToLast(arr);
        System.out.println(Arrays.toString(ints));
    }
}
