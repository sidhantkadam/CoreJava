package Array;

import java.util.Arrays;

public class ArrayDiffMinMax {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};
        int min = arr[0];
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        float x = ((float) (sum - max - min) / (arr.length - 2));
        System.out.println(min);
        System.out.println(max);
        System.out.println("Diff : " + (max - min));
        System.out.println(x);
    }
}