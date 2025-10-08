package Java8.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByMethod {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");


        //Partitioning method with Predicate parameter
        Map<Boolean, List<String>> collect = li.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println(collect);

        //Partitioning method with Predicate and Downstream parameter
        Map<Boolean, Long> collect1 = li.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 4, Collectors.counting()));
        System.out.println(collect1);
    }
}
