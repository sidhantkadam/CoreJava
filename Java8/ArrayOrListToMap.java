package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayOrListToMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Integer, Integer> collect = numbers.stream()
                .collect(
                        Collectors.toMap(integer -> integer, sqrInt -> sqrInt * sqrInt)
                );

        System.out.println(collect);

        int[] arrNumbers = new int[]{1, 2, 3, 4, 5, 6};
        Map<Integer, Integer> collect1 = Arrays.stream(arrNumbers)
                .boxed()
                .collect(Collectors.toMap(integer -> integer, sqInt -> sqInt * sqInt));

        System.out.println(collect1);
    }
}
