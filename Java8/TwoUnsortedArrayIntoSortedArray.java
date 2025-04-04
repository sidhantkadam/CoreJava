package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoUnsortedArrayIntoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 5, 6, 7};
        int[] arr2 = {1, 4, 9, 8, 10};

        int[] sorted = IntStream.concat(Arrays.stream(arr1).sorted(), Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(sorted));
    }
}
