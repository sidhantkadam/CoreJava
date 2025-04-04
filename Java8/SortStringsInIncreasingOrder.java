package Java8;

import java.util.Arrays;
import java.util.List;

public class SortStringsInIncreasingOrder {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Java", "Python", "C++", "C#");

        strs.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}
