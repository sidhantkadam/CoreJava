package Array;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubArrays {
    private static int calculateSumOfAllSubArrays(int[] arr) {
        int totalSum = 0;
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(arr[k]);
                }
                li.add(list);
            }
        }
        System.out.println(li);
        for (List<Integer> add : li) {
            int sum = 0;
            for (Integer i : add) {
                sum += i;
            }
            totalSum += sum;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = calculateSumOfAllSubArrays(arr);
        System.out.println(sum);
    }
}
