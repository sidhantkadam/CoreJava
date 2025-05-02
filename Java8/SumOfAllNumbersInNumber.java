package Java8;

import java.util.Arrays;

public class SumOfAllNumbersInNumber {
    public static void main(String[] args) {
        int num = 639006093;

        Integer sum = Arrays.stream(String.valueOf(num)
                        .split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println(sum);
    }
}
