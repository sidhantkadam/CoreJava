package Java8.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ToCollectionMethod {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        //Work with toCollection() method of Collectors class
        TreeSet<String> str = li.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println(str);

        //Work with counting() method
        long count = li.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
