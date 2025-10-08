package Java8.CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        //Simple joining overloaded method
        String collect = li.stream().collect(Collectors.joining());
        System.out.println(collect);

        //Joining with delimiter
        String collect1 = li.stream()
                .collect(Collectors.joining(", "));
        System.out.println(collect1);

        //Joining with delimiter, prefix and suffix
        String collect2 = li.stream()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(collect2);
    }
}
