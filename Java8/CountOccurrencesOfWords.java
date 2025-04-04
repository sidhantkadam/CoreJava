package Java8;

    /*
    Given a list of words, count how many times each word appears using Streams.
        Example Input:
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Expected Output:
        {
          apple = 3,
          banana = 2,
          orange = 1
        }
     */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOccurrencesOfWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        words.stream()
                .collect(Collectors.groupingBy(
                        s -> s, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
    }
}
