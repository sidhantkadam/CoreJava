package Array;

import java.util.HashSet;
import java.util.Set;

public class MissingAndRepeated {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 1};
        int n = arr.length;
        int index = 0;
        int repeated = 0;

        Set<Integer> set = new HashSet<>();
        //find the repeated
        for (int k : arr) {
            for (int i : arr) {
                if (k == i) {
                    repeated = i;
                }
            }
        }

        //added the distinct int to set
        for (Integer I : arr) {
            set.add(I);
        }
        //copy the numbers from set to array
        int[] distinct = new int[set.size()];
        for (int i : set) {
            distinct[index++] = i;
        }

        //find the missing from distinct array
        int missing = 0;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int k = 0; k < distinct.length; k++) {
                if (distinct[k] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
            }
        }
        System.out.println(repeated);
        System.out.println(missing);
    }
}
