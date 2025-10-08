package InterviewOrExams;

import java.util.HashSet;
import java.util.Set;

public class InfivitTech_Code2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 5, 4, 3, 4, 5, 0, 6, 3};
        int target = 9;

        Set<String> set = new HashSet<>();
        boolean flag = false;
        for (int j : arr) {
            for (int k : arr) {
                int sum = j + k;
                if (sum == target) {
                    flag = true;
                    String pair;
                    if (j < k) {
                        pair = j + "," + k;
                    } else {
                        pair = k + "," + j;
                    }
                    if (set.add(pair)) {
                        System.out.println(j + " " + k);
                    }
                }
            }
        }
    }
}
