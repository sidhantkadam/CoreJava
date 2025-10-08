package Java8;

import java.util.OptionalInt;
import java.util.stream.Stream;

public class LongestEvenLength {
    public static void main(String[] args) {
        String s = "ashvvb asbc sjbc ajsc ascajsbcjas as chasb s  chasb";

        OptionalInt max = Stream.of(s.split(" "))
                .filter(s1 -> s1.length() % 2 == 0)
                .mapToInt(String::length)
                .max();
        System.out.println(max);
    }
}
