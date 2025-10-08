package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class AllMatchAnyMatchNoneMatch {
    public static void main(String[] args) {
        List<String> li1 = Arrays.asList("abc", "def", "ghi", "jkl");
        List<String> li2 = Arrays.asList("abc", "def", "ghi", "jkl");

        boolean allMatch = li1.stream()
                .allMatch(li2::contains);
        System.out.println("AllMatch : " + allMatch);

        boolean anyMatch = li1.stream()
                .anyMatch(li2::contains);
        System.out.println("AnyMatch : " + anyMatch);

        boolean noneMatch = li1.stream()
                .noneMatch(li2::contains);
        System.out.println("NoneMatch : " + noneMatch);
    }
}
