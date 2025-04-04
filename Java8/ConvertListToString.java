package Java8;

/*
        Question:
        Convert a list of names into a comma-separated string using Streams.

        Example Input:
        List<String> names = Arrays.asList("John", "Jane", "Doe");

        Expected Output:
        "John, Jane, Doe"
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Doe");

        String collect = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
