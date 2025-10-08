package Java8;

import java.util.Arrays;
import java.util.List;

public class FindPalindromicStrings
{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("radar", "level", "world", "java");

        List<String> list = words.stream()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .toList();
        System.out.println(list);
    }
}
