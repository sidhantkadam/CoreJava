package Java8;

    /*
        5. Count frequency of word lengths
        Input: "I am using Java Stream API for text analysis"

        Output: {1=1, 2=1, 3=1, 4=2, 5=1, 6=1, 7=1}
    */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequenciesOfWords {
    public static void main(String[] args) {
        String Input = "I am using Java Stream API for text analysis";

        Map<Integer, Long> collect = Arrays.stream(
                        Input.trim()
                                .split(" ")
                )
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(collect);
    }
}
