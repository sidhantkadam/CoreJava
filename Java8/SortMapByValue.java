package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<Integer, String> pairs = new HashMap<>();
        pairs.put(1, "C");
        pairs.put(2, "B");
        pairs.put(3, "A");

        Map<Integer, String> sortedByValue = doSortingWithValues(pairs);
        sortedByValue.forEach((integer, s) -> System.out.println(integer + s));
    }

    private static Map<Integer, String> doSortingWithValues(Map<Integer, String> pairs) {

        return pairs.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }
}
