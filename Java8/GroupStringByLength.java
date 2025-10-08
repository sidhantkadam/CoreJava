package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Book", "Food", "House", "Mobile", "Education");

        Map<Integer, List<String>> collect = li.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
