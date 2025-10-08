package Java8;

/*
Remove all stopwords and sort remaining words by decreasing length
Input: "This is a sample of the Java 8 Stream API in action"

Stopwords: ["a", "the", "of", "in", "is", "this"]
Output: "sample Stream action Java API"
*/

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveStopWordsAndSortRemaining {
    public static void main(String[] args) {
        String Input = "This is a sample of the Java 8 Stream API in action";

        String[] StopWords = {"a", "the", "of", "in", "is", "this"};

        Set<String> collect1 = Arrays.stream(StopWords)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        String collect = Arrays.stream(Input.toLowerCase().trim().split(" "))
                .filter(s -> !collect1.contains(s))
                .sorted((o1, o2) -> o2.length() - o1.length())
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
