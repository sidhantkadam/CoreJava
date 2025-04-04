package Array;

import java.util.*;

public class GenerateAllSubArray {
    public static List<List<Integer>> generateSubstring(List<Integer> li) {
        List<List<Integer>> returnSetList = new ArrayList<>();

        for (int i = 0; i < li.size(); i++) {
            for (int j = i; j < li.size(); j++) {
                for (int k = i; k <= j; k++) {
                    List<Integer> l = new ArrayList<>();
                    l.add(li.get(k));
                    returnSetList.add(l);
                }
            }
        }
        return returnSetList;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println(generateSubstring(li));
    }
}
