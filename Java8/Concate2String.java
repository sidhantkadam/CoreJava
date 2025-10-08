package Java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concate2String {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "World";

        String collect = String.join("", s1, s2);

        String collect1 = Stream.of(s1, s2)
                .collect(Collectors.joining());
        System.out.println(collect);
        System.out.println(collect1);
    }
}
