package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap
{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");

        Map<String, Integer> collect = words.stream()
                .collect(Collectors.toMap(s -> s, String::length));

        System.out.println(collect);
    }
}
