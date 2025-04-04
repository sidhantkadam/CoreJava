package Array;

import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};
        int[] newArray = new int[input.length];
        int start = 0;
        int end = input.length - 1;
        int index = 0;

        while (start <= end) {
            if (index % 2 == 0) {
                newArray[index] = input[end];
                index++;
                end--;
            } else {
                newArray[index] = input[start];
                index++;
                start++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
