package Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllPairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {15, 7, 8, 10, 2, 5, 8, 7};
        List<List<Integer>> pairs = new ArrayList<>();
        int target = 15;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    List<Integer> li = new ArrayList<>();
                    li.add(arr[i]);
                    li.add(arr[j]);
                    if (!pairs.contains(li)) {
                        pairs.add(li);
                    }
                }
            }
        }
        System.out.println(pairs);
    }
}
