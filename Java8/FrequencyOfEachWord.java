package Java8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
        String[] arr = {"Sid", "Sid", "Kadam"};

        Map<String, Long> collect = Stream.of(arr)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(collect);
    }
}
