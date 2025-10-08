package InterviewOrExams;
    /*
    Write a program to sort words in sentence according to length of the word in ascending order.
    Input: “what are your names ?”
    Output: “? are what your names”
    using Stream API.
    */

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KPMG2 {
    public static void main(String[] args) {
        String input = "what are your names ?";

        String collect = Stream.of(
                        input.trim().split(" ")
                )
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
