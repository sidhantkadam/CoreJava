package Array;

import java.util.HashSet;
import java.util.Set;

public class PairSumInSortedAndRotatedArray {

    private static boolean checkTheSumWithTargetUsingHashing(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int fix : arr) {
            for (int i : arr) {
                int sum = fix + i;
                set.add(sum);
            }
        }
        return set.contains(target);
    }

    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;

        boolean result1 = checkTheSumWithTargetUsingHashing(arr, target);
        System.out.println(result1);
    }
}
