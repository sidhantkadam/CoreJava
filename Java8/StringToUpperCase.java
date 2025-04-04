package Java8;

import java.util.Arrays;
import java.util.List;

public class StringToUpperCase
{
    public static void main(String[] args) {
        List<String> s = Arrays.asList("hello", "hi","bye","chalo");

        List<String> list = s.stream().map(String::toUpperCase).toList();

        list.forEach(
                System.out::println
        );
    }
}
