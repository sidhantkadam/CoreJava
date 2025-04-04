package Array;

import java.util.Arrays;
import java.util.List;

public class SortedOrNot {
    private static String checkSortedOrNot(List<Integer> li) {
        String result = "";

        if (li.size() == 1 || li.size() == 0) {
            result = "Yes";
        }
        for (int i = 1; i < li.size(); i++) {
            if (li.get(i - 1) > li.get(i)) {
                result = "No";
            } else {
                result = "Yes";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(20, 21, 45, 89, 89, 90);
        String s = checkSortedOrNot(li);
        System.out.println(s);
    }
}
