package Java8;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


    /*
    Question:
    Given a string, find the first non-repeating character using Stream API.

    Example Input:
    String input = "swiss";

    Expected Output:
    w
    */

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "swiss";

        Character key1 = input.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(o -> o, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(set -> set.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
        System.out.println(key1);
    }
}
