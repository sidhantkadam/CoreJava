package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Merge two sorted list in sorted form

public class MergeSortedList {
    public static void main(String[] args) {
        List<Integer> li1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> li2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> concat = Stream.concat(li1.stream(), li2.stream())
                .sorted().toList();
           System.out.println(concat);
    }
}
