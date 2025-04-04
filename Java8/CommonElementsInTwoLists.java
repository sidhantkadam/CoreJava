package Java8;

    /*
    Question:
    Find the common elements between two lists using Streams.

    Example Input:
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
    Expected Output:
    [3, 4, 5]
    */

import java.util.Arrays;
import java.util.List;

public class CommonElementsInTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> collect = list1.stream()
                .filter(list2::contains)
                .toList();
        System.out.println(collect);
    }
}
