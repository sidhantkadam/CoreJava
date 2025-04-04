package Array;


import java.util.Arrays;

public class ReverseTheArray {

    private static void doReverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last)
        {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 2, 9, 10};
        doReverse(arr);
    }
}
