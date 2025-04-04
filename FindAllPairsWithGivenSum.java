import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" +
                first + "," +
                second +
                ')';
    }
}

class Solution {
    public static pair[] allPairs(int target, int[] arr1, int[] arr2) {
        List<pair> list = new ArrayList<>();
        for (int k : arr1) {
            for (int i : arr2) {
                if (k + i == target) {
                    list.add(new pair(k, i));
                }
            }
        }
        return list.toArray(new pair[0]);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 7, 4};
        int[] arr2 = {5, 6, 3, 4, 8, 4};
        int target = 9;
        pair[] pairs = allPairs(target, arr1, arr2);
        System.out.println(Arrays.toString(pairs));
    }
}
