package InterviewOrExams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HoneyBeeTech1 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<Integer> li1 = Arrays.asList(1, 2, 3, 4, 5, 6);

        Set<Integer> collect1 = li.stream()
                .filter(li1::contains)
                .collect(Collectors.toSet());
        System.out.println(collect1);
    }
}
