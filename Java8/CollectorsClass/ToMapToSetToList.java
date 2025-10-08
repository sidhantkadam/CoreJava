package Java8.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToMapToSetToList {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        List<String> collect = li.stream()
                .filter(str -> str.length() > 3)
                .collect(Collectors.toList());
        System.out.println("List : " + collect);

        Set<String> collect1 = li.stream()
                .filter(str -> str.length() >= 4 && str.length() <= 5)
                .collect(Collectors.toSet());
        System.out.println("Set : " + collect1);

        Map<String, Integer> collect2 = li.stream()
                .filter(str -> str.length() > 4)
                .collect(Collectors.toMap(s -> s, String::length));
        System.out.println("Map : " + collect2);

        //Merge method for same/duplicate keys in map (Key collision)
        Map<Integer, String> collect3 = li.stream()
                .collect(Collectors.toMap(String::length, e -> e, (oldValue, newValue) -> oldValue + ", " + newValue));
        System.out.println("Map with duplicate keys : " + collect3);
    }
}
