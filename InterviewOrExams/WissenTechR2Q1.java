package InterviewOrExams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WissenTechR2Q1 {
    public static void main(String[] args) {
        String s = "Java is a amazing language to learn in 2025";

        String collect = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
