package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSorted {
    public static List<Integer> removeDuplicatesFromSorted(List<Integer> li) {
        List<Integer> actual = new ArrayList<>();
        actual.add(li.getFirst());
        for (int i = 1; i < li.size() - 1; i++) {
            if (!li.get(i).equals(li.get(i-1))) {
                actual.add(li.get(i));
            }
        }
        return actual;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5);
        System.out.println(removeDuplicatesFromSorted(li));
    }
}
