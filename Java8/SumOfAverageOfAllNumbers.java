package Java8;

import java.util.Arrays;

public class SumOfAverageOfAllNumbers {
    public static void main(String[] args) {
        int[] a = {45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(a).sum();

        Double average = Arrays.stream(a).average().getAsDouble();
        System.out.println(sum);
        System.out.println(average);
    }
}
