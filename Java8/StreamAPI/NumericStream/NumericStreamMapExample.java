package Java8.StreamAPI.NumericStream;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> maToObj() {
        return IntStream.rangeClosed(1, 50)
                .mapToObj((i) -> i
                )
                .toList();
    }

    public static Double mapToDouble() {
        return IntStream.rangeClosed(1, 50)
                .mapToDouble((i) -> i
                )
                .sum();
    }

    public static Long mapToLong() {
        return IntStream.rangeClosed(2, 9)
                .mapToLong(i -> i)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> intList = maToObj();
        System.out.println("List of Integers : " + intList);

        System.out.println("Sum in double digit : " + mapToDouble());

        System.out.println("Sum in long digit : " + mapToLong());
    }
}
