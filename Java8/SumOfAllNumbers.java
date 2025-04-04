package Java8;

import java.util.Arrays;

public class SumOfAllNumbers {

    public static void main(String[] args) {
        int[] arr = {2,3,6,5,2,3,5};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
