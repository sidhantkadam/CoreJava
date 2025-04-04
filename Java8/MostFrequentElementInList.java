package Java8;

    /*
        Question:
        Find the most frequently occurring element in a list using Streams.

        Example Input:
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

        Expected Output:
        4
     */

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentElementInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

        Long entry = numbers.stream()
                .collect(Collectors.groupingBy(o -> o, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .get()
                .getValue();
        System.out.println(entry);
    }
}
