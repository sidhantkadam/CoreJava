package Java8;

import java.util.Arrays;
import java.util.List;

public class AddFirstTwoNumbersFromList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(23, 4, 56, 7, 345, 9);

        int sum = num.stream()
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
