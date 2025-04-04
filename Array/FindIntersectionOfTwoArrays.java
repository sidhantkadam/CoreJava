package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5};

        List<Integer> merge = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            merge.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            merge.add(arr2[i]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < merge.size(); i++) {
            map.put(merge.get(i), map.getOrDefault(merge.get(i), 0) + 1);
        }
        System.out.println(map);
    }
}
