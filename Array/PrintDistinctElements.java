package Array;

import java.util.*;

public class PrintDistinctElements {
    private static List<Integer> removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        return set.stream().toList();
    }

    private static List<Integer> removeDuplicatesNative(int[] arr) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                li.add(arr[i]);
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int[] arr = {100, 300, 300, 500, 100, 100, 600};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicatesNative(arr));
    }
}
