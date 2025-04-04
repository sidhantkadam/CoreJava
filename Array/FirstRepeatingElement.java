package Array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingElement {
    private static int findFirstRepeating(int[] arr) {
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40};

        int firstRepeating = findFirstRepeating(arr);
        int firstRepeatingHash = findFirstRepeatingUsingHash(arr);
        System.out.println(firstRepeating);
        System.out.println(firstRepeatingHash);
    }

    private static int findFirstRepeatingUsingHash(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return -1;
    }
}
