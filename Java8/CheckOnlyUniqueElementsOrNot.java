package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckOnlyUniqueElementsOrNot {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6);

        boolean b = numbers.stream()
                .collect(Collectors.toSet())
                .size() == numbers.size();
        System.out.println(b);
    }
}
