package Java8;

import java.util.Arrays;
import java.util.List;

public class StringsStartsWithNumber {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("1apple", "banana", "2cherry", "3watermelon", "orange");

        li.stream()
                .filter(str -> !str.isEmpty() && Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);
    }
}
