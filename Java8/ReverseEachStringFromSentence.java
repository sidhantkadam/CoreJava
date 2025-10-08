package Java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachStringFromSentence {
    public static void main(String[] args) {
        String inout = "India is my country and I love my country !";

        String output = Arrays.stream(inout.split(" "))
                .map(str -> new StringBuilder(str).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
