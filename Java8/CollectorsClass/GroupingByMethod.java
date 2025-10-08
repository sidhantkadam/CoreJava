package Java8.CollectorsClass;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByMethod {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        //Simple Grouping By Method using Function as parameter
        Map<Character, List<String>> collect = li.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(collect);

        //Grouping By Method using Function and DownStream collector as parameter
        Map<Character, String> collect1 = li.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.joining("=>")));
        System.out.println(collect1);

        //Grouping By Method using Function, DownStream collector and Supplier as parameter
        Map<Character, String> collect2 = li.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), TreeMap::new, Collectors.joining("=>")
                ));
        System.out.println(collect2);
    }
}
