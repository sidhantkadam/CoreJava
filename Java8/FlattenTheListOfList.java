package Java8;

    /*
        Question:
        Given a list of lists, flatten it into a single list using Stream API.
        Example Input:
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        Expected Output:
        [1, 2, 3, 4, 5, 6, 7, 8, 9]
     */

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenTheListOfList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> list = listOfLists.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(list);
    }
}
