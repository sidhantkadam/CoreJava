package Java8.StreamAPI.Terminal;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class StreamsJoining {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("hi", "pune", "peoples");

        String collect = strs.stream()
                .map(String::toUpperCase)
                .collect(joining(", ", "(", ")"));
        System.out.println(collect);
    }
}
